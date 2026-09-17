package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
class UnknownFieldSetLiteSchema extends androidx.datastore.preferences.protobuf.UnknownFieldSchema<androidx.datastore.preferences.protobuf.UnknownFieldSetLite, androidx.datastore.preferences.protobuf.UnknownFieldSetLite> {
    UnknownFieldSetLiteSchema() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: addFixed32, reason: avoid collision after fix types in other method */
    void addFixed322(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2, int r3, int r4) {
            r1 = this;
            r0 = 5
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.makeTag(r3, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.storeField(r3, r4)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void addFixed32(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1, int r2, int r3) {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r1
            r0.addFixed322(r1, r2, r3)
            return
    }

    /* renamed from: addFixed64, reason: avoid collision after fix types in other method */
    void addFixed642(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2, int r3, long r4) {
            r1 = this;
            r0 = 1
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.makeTag(r3, r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.storeField(r3, r4)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void addFixed64(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1, int r2, long r3) {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r1
            r0.addFixed642(r1, r2, r3)
            return
    }

    /* renamed from: addGroup, reason: avoid collision after fix types in other method */
    void addGroup2(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2, int r3, androidx.datastore.preferences.protobuf.UnknownFieldSetLite r4) {
            r1 = this;
            r0 = 3
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.makeTag(r3, r0)
            r2.storeField(r3, r4)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void addGroup(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1, int r2, androidx.datastore.preferences.protobuf.UnknownFieldSetLite r3) {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r1
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r3 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r3
            r0.addGroup2(r1, r2, r3)
            return
    }

    /* renamed from: addLengthDelimited, reason: avoid collision after fix types in other method */
    void addLengthDelimited2(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2, int r3, androidx.datastore.preferences.protobuf.ByteString r4) {
            r1 = this;
            r0 = 2
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.makeTag(r3, r0)
            r2.storeField(r3, r4)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void addLengthDelimited(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1, int r2, androidx.datastore.preferences.protobuf.ByteString r3) {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r1
            r0.addLengthDelimited2(r1, r2, r3)
            return
    }

    /* renamed from: addVarint, reason: avoid collision after fix types in other method */
    void addVarint2(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2, int r3, long r4) {
            r1 = this;
            r0 = 0
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.makeTag(r3, r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.storeField(r3, r4)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void addVarint(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1, int r2, long r3) {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r1
            r0.addVarint2(r1, r2, r3)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    androidx.datastore.preferences.protobuf.UnknownFieldSetLite getBuilderFromMessage(java.lang.Object r3) {
            r2 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r0 = r2.getFromMessage(r3)
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()
            if (r0 != r1) goto L11
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r0 = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.newInstance()
            r2.setToMessage2(r3, r0)
        L11:
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.UnknownFieldSetLite getBuilderFromMessage(java.lang.Object r1) {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = r0.getBuilderFromMessage(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    androidx.datastore.preferences.protobuf.UnknownFieldSetLite getFromMessage(java.lang.Object r1) {
            r0 = this;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r1
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = r1.unknownFields
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.UnknownFieldSetLite getFromMessage(java.lang.Object r1) {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = r0.getFromMessage(r1)
            return r1
    }

    /* renamed from: getSerializedSize, reason: avoid collision after fix types in other method */
    int getSerializedSize2(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1) {
            r0 = this;
            int r1 = r1.getSerializedSize()
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ int getSerializedSize(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1) {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r1
            int r1 = r0.getSerializedSize2(r1)
            return r1
    }

    /* renamed from: getSerializedSizeAsMessageSet, reason: avoid collision after fix types in other method */
    int getSerializedSizeAsMessageSet2(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1) {
            r0 = this;
            int r1 = r1.getSerializedSizeAsMessageSet()
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ int getSerializedSizeAsMessageSet(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1) {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r1
            int r1 = r0.getSerializedSizeAsMessageSet2(r1)
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    void makeImmutable(java.lang.Object r1) {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = r0.getFromMessage(r1)
            r1.makeImmutable()
            return
    }

    /* renamed from: merge, reason: avoid collision after fix types in other method */
    androidx.datastore.preferences.protobuf.UnknownFieldSetLite merge2(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2, androidx.datastore.preferences.protobuf.UnknownFieldSetLite r3) {
            r1 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r0 = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lb
            goto Lf
        Lb:
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2 = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.mutableCopyOf(r2, r3)
        Lf:
            return r2
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.UnknownFieldSetLite merge(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1, androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2) {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r1
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r2
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = r0.merge2(r1, r2)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    androidx.datastore.preferences.protobuf.UnknownFieldSetLite newBuilder() {
            r1 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r0 = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.newInstance()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.UnknownFieldSetLite newBuilder() {
            r1 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r0 = r1.newBuilder()
            return r0
    }

    /* renamed from: setBuilderToMessage, reason: avoid collision after fix types in other method */
    void setBuilderToMessage2(java.lang.Object r1, androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2) {
            r0 = this;
            r0.setToMessage2(r1, r2)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void setBuilderToMessage(java.lang.Object r1, androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2) {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r2
            r0.setBuilderToMessage2(r1, r2)
            return
    }

    /* renamed from: setToMessage, reason: avoid collision after fix types in other method */
    void setToMessage2(java.lang.Object r1, androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2) {
            r0 = this;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r1
            r1.unknownFields = r2
            return
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void setToMessage(java.lang.Object r1, androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2) {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r2
            r0.setToMessage2(r1, r2)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    boolean shouldDiscardUnknownFields(androidx.datastore.preferences.protobuf.Reader r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: toImmutable, reason: avoid collision after fix types in other method */
    androidx.datastore.preferences.protobuf.UnknownFieldSetLite toImmutable2(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1) {
            r0 = this;
            r1.makeImmutable()
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.UnknownFieldSetLite toImmutable(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1) {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r1
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = r0.toImmutable2(r1)
            return r1
    }

    /* renamed from: writeAsMessageSetTo, reason: avoid collision after fix types in other method */
    void writeAsMessageSetTo2(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1, androidx.datastore.preferences.protobuf.Writer r2) throws java.io.IOException {
            r0 = this;
            r1.writeAsMessageSetTo(r2)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void writeAsMessageSetTo(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1, androidx.datastore.preferences.protobuf.Writer r2) throws java.io.IOException {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r1
            r0.writeAsMessageSetTo2(r1, r2)
            return
    }

    /* renamed from: writeTo, reason: avoid collision after fix types in other method */
    void writeTo2(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1, androidx.datastore.preferences.protobuf.Writer r2) throws java.io.IOException {
            r0 = this;
            r1.writeTo(r2)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void writeTo(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1, androidx.datastore.preferences.protobuf.Writer r2) throws java.io.IOException {
            r0 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r1
            r0.writeTo2(r1, r2)
            return
    }
}
