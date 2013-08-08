function loadCluster(collection, rootId, rootDepth, clusterDepth, clusterBreadth, maxDocCount) {
	var clusterDocs = [];
	var count = 0;
	var loadedIds = [];
	var stop = false;

	loadedIds[0] = rootId;
	for (i=rootDepth + 1; (i<rootDepth + clusterDepth) && !stop; i++) {
		var query;
		if (clusterBreadth < 0) {
			query = { morsa_ancestors_attr : rootId, morsa_depth_attr : i }; 
		}
		else {
			query = { morsa_ancestors_attr : rootId, morsa_depth_attr : i, morsa_breadth_attr : { $lt : clusterBreadth } }; 
		}
		var found = false;
		var StopException = {};
		try{
		db[collection].find(query).forEach(
			function(descendant) {
				var innerFound = false;
				for (j=0; j<descendant.morsa_ancestors_attr.length && !innerFound; j++) {	
					for (k=0; k<loadedIds.length; k++) {
						if (loadedIds[k].toString() == descendant.morsa_ancestors_attr[j].toString()) {
							clusterDocs[count] = descendant;
							loadedIds[count + 1] = descendant._id;
							if (count++ >= maxDocCount) {
								stop = true;
															
								throw StopException;						
							}
							found = true;
							innerFound = true;
							break;
						}
					}
				}
			}
		);
		} catch (e) {
			if (e !== StopException) throw e;
		}
		if (!found) stop = true;
	}
	
	return clusterDocs;
}