package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
class GeneratedMessageInfoFactory implements androidx.datastore.preferences.protobuf.MessageInfoFactory {
    private static final androidx.datastore.preferences.protobuf.GeneratedMessageInfoFactory instance = null;

    static {
            androidx.datastore.preferences.protobuf.GeneratedMessageInfoFactory r0 = new androidx.datastore.preferences.protobuf.GeneratedMessageInfoFactory
            r0.<init>()
            androidx.datastore.preferences.protobuf.GeneratedMessageInfoFactory.instance = r0
            return
    }

    private GeneratedMessageInfoFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.datastore.preferences.protobuf.GeneratedMessageInfoFactory getInstance() {
            androidx.datastore.preferences.protobuf.GeneratedMessageInfoFactory r0 = androidx.datastore.preferences.protobuf.GeneratedMessageInfoFactory.instance
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public boolean isSupported(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<androidx.datastore.preferences.protobuf.GeneratedMessageLite> r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.class
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public androidx.datastore.preferences.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> r5) {
            r4 = this;
            java.lang.Class<androidx.datastore.preferences.protobuf.GeneratedMessageLite> r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 == 0) goto L33
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch: java.lang.Exception -> L17
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.getDefaultInstance(r0)     // Catch: java.lang.Exception -> L17
            java.lang.Object r0 = r0.buildMessageInfo()     // Catch: java.lang.Exception -> L17
            androidx.datastore.preferences.protobuf.MessageInfo r0 = (androidx.datastore.preferences.protobuf.MessageInfo) r0     // Catch: java.lang.Exception -> L17
            return r0
        L17:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to get message info for "
            r2.append(r3)
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L33:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported message type: "
            r1.append(r2)
            java.lang.String r5 = r5.getName()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }
}
