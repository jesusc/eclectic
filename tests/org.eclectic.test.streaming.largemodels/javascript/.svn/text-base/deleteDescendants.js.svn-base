function deleteDescendants(collection, roots, excludedIds) {
	var deletedObjs = [];
	count = 0;
	for (i=0; i<roots.length; i++) {
		db[collection].find({morsa_ancestors_attr : roots[i]._id }).forEach(
			function(descendant) {
				var isExcluded = false;
				for (j=0; j<excludedIds.length; j++) {
					if (excludedIds.toString() == descendant._id.toString()) isExcluded = true;
				}
				if (!isExcluded) {
					isExcluded = false;
					for (j=0; j<descendant.morsa_ancestors_attr.length && !isExcluded; j++) {	
						for (k=0; k<excludedIds.length && !isExcluded; k++) {
							if (excludedIds[k].toString() == descendant.morsa_ancestors_attr[j].toString()) {
								isExcluded = true;
							}
						}
					}
					if (!isExcluded) {
						db[collection].remove({ _id : descendant._id});
						deletedObjs[count++] = { _id : descendant._id, morsa_model_attr : roots[i].morsa_model_attr, morsa_metatype_attr : descendant.morsa_metatype_attr, morsa_ancestors_attr : descendant.morsa_ancestors_attr};
					} 
				}
			}
		);
		
		db.morsa_sketchcollection.find({morsa_ancestors_attr : roots[i]._id }).forEach(
			function(descendant) {
				db[collection].remove({ _id : descendant._id});
				deletedObjs[count++] = { _id : descendant._id, morsa_model_attr : descendant.morsa_model_attr, morsa_metatype_attr : descendant.morsa_metatype_attr, morsa_ancestors_attr : descendant.morsa_ancestors_attr }; 
			}
		);
		
		db[collection].remove({ _id : roots[i]._id });
		deletedObjs[count++] = { _id : roots[i]._id, morsa_model_attr : roots[i].morsa_model_attr, morsa_metatype_attr : roots[i].morsa_metatype_attr, morsa_ancestors_attr : roots[i].morsa_ancestors_attr };
	}
	
	return deletedObjs;
}