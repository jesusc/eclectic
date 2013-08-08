function updateDescendantsBreadth(collection, ancestorDescriptors, debug) {
	var updatedObjs = [];
	count = 0;
	for (i=0; i<ancestorDescriptors.length; i++) {
		var ancestorId = ancestorDescriptors[i]._id;
		var references = ancestorDescriptors[i].references;
		var ancestorDoc = db[collection].findOne({ _id : ancestorId });
		for (j=0; j<references.length; j++) {
			var reference = references[j];			
			var breadth = 0; 
			if (ancestorDoc.hasOwnProperty(reference)) {
				for (k=0; k<ancestorDoc[reference].length; k++) {
					var referenceDescriptor = ancestorDoc[reference][k];
					referenceDescriptor = referenceDescriptor.substring(referenceDescriptor.lastIndexOf("!!") + 2);
					var child = db[collection].findOne({ _id : ObjectId(referenceDescriptor) });
					if (child != null && child.morsa_breadth_attr != k) {
						db[collection].update({ _id : ObjectId(referenceDescriptor) }, { $set : { morsa_breadth_attr : Math.round(k) } });
						if (debug)
							updatedObjs[count++] = { _id : child._id, morsa_container_attr : ancestorId, morsa_breadth_attr : Math.round(k) };
					}
				}
			}
		}		
	}
	
	return updatedObjs;
}