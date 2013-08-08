function flushSketches(sessionId, debug) {
	var flushedSketches = [];
	count = 0;
	
	db.morsa_sketchcollection.find({ morsa_session_attr : sessionId }).forEach(
		function(sketch) {
			sketch._id = sketch.morsa_sketch_id_attr;
			delete sketch.morsa_sketch_id_attr;
			delete sketch.morsa_session_attr;
			db[sketch.morsa_model_attr].save(sketch);
			if (debug)
				flushedSketches[count++] = { _id : sketch._id, morsa_metatype_attr : sketch.morsa_metatype_attr};			
		}
	);
		
	return flushedSketches;
}