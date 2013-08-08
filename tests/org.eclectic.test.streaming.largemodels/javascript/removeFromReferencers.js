function removeFromReferencers(collection, removedObjs, refDescriptors, debug) {
	var updatedObjs = [];
	var count = 0;
	for (i=0; i<refDescriptors.metatypes.length; i++) {
		var metatype = refDescriptors.metatypes[i];
		db[collection].find({ morsa_metatype_attr : metatype.name }).forEach(
			function(refObj) {
				var targetCount = 0;
				var update = false;
				var targets = [];	
				for (j=0;j<metatype.references.length;j++) {
					var reference = metatype.references[j];														
					if (refObj.hasOwnProperty(reference.name)) {
						if (reference.isMany) {
							var size = refObj[reference.name].length;
							for (k=0;k<size;k++) {
								if (removedObjs.indexOf(refObj[reference.name][k]) != -1) {
									targets[targetCount++] = refObj[reference.name][k];
									delete refObj[reference.name][k];									
									update = true;
								}
							}
							if (refObj[reference.name].size == 0) delete refObj[reference.name];
						}
						else if (removedObjs.indexOf(refObj[reference.name]) != -1) {
							targets[targetCount++] = refObj[reference.name];
							delete refObj[reference.name];
							update = true;
						}
					}									
				}
				if (update) {
					db[collection].save(refObj);
					if (debug)
						updatedObjs[count++] = { _id : refObj._id, morsa_metatype_attr : refObj.morsa_metatype_attr, morsa_ancestors_attr : targets };
				}
			}
		);		
	}
	
	return updatedObjs;
}