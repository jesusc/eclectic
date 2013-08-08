function updateDescendants(collection, ancestors, debug) {
	var updatedObjs = [];
	count = 0;
	for (i=0; i<ancestors.length; i++) {
		var ancestorId = ancestors[i];
		var ancestorSubtree = db[collection].findOne({ _id : ancestorId }).morsa_ancestors_attr;
		db[collection].find({ morsa_ancestors_attr : ancestorId }).forEach(
			function(descendant) {				
				var descendantSubtree = descendant.morsa_ancestors_attr;
				var index = 0;
				for (j=0;j<descendantSubtree.length;j++) {
					if (descendantSubtree[j].toString() == ancestorId.toString()) {
						index = j; break;
					}
				}				
				descendantSubtree = descendantSubtree.slice(index, descendantSubtree.length);
				descendantSubtree = ancestorSubtree.concat(descendantSubtree);	
				db[collection].update({ _id : descendant._id }, { $set : { morsa_ancestors_attr : descendantSubtree, morsa_depth_attr : Math.round(descendantSubtree.length) }});
				if (debug)
					updatedObjs[count++] = { _id : descendant._id, morsa_metatype_attr : descendant.morsa_metatype_attr, morsa_container_attr : ancestorId, morsa_depth_attr : Math.round(descendantSubtree.length), morsa_ancestors_attr : descendantSubtree };
			}
		);	
	}
	
	return updatedObjs;
}