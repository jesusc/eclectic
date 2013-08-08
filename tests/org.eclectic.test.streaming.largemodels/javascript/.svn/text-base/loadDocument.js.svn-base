function loadDocument(objectURI) {
	var rootURI = objectURI.substring(0, objectURI.indexOf("#"));
	var indexDoc = db.morsa_indexcollection.findOne({});
	var root = db[rootURI].findOne({ _id : indexDoc[rootURI.replace(".", "[dot]")].$id });
	var refDescriptors = objectURI.substring(objectURI.indexOf("#") + 1).split("/@");
	for (i=1; i< refDescriptors.length; i++) {
		var isMany = false;
		var refName;
		var index = 0;
		if (refDescriptors[i].indexOf(".") != -1) {
			isMany = true;
			index = refDescriptors[i].substring(refDescriptors[i].indexOf(".") + 1);
			refName = refDescriptors[i].substring(0, refDescriptors[i].indexOf("."));
		} else refName = refDescriptors[i];
		var ref = root[refName];
		if (isMany) {
			ref = root[refName][index];
		}
		root = db[rootURI].findOne({ _id : ObjectId(ref.substring(ref.lastIndexOf("!!") + 2)) });
	}
	return root;
}