package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class NewInstanceSchemaLite implements androidx.datastore.preferences.protobuf.NewInstanceSchema {
    NewInstanceSchemaLite() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.datastore.preferences.protobuf.NewInstanceSchema
    public java.lang.Object newInstance(java.lang.Object r2) {
            r1 = this;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r2 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r2
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE
            java.lang.Object r2 = r2.dynamicMethod(r0)
            return r2
    }
}
