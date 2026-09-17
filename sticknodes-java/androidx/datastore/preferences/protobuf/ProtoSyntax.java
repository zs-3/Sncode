package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public enum ProtoSyntax extends java.lang.Enum<androidx.datastore.preferences.protobuf.ProtoSyntax> {
    private static final /* synthetic */ androidx.datastore.preferences.protobuf.ProtoSyntax[] $VALUES = null;
    public static final androidx.datastore.preferences.protobuf.ProtoSyntax PROTO2 = null;
    public static final androidx.datastore.preferences.protobuf.ProtoSyntax PROTO3 = null;

    static {
            androidx.datastore.preferences.protobuf.ProtoSyntax r0 = new androidx.datastore.preferences.protobuf.ProtoSyntax
            java.lang.String r1 = "PROTO2"
            r2 = 0
            r0.<init>(r1, r2)
            androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO2 = r0
            androidx.datastore.preferences.protobuf.ProtoSyntax r1 = new androidx.datastore.preferences.protobuf.ProtoSyntax
            java.lang.String r3 = "PROTO3"
            r4 = 1
            r1.<init>(r3, r4)
            androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO3 = r1
            r3 = 2
            androidx.datastore.preferences.protobuf.ProtoSyntax[] r3 = new androidx.datastore.preferences.protobuf.ProtoSyntax[r3]
            r3[r2] = r0
            r3[r4] = r1
            androidx.datastore.preferences.protobuf.ProtoSyntax.$VALUES = r3
            return
    }

    ProtoSyntax(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static androidx.datastore.preferences.protobuf.ProtoSyntax valueOf(java.lang.String r1) {
            java.lang.Class<androidx.datastore.preferences.protobuf.ProtoSyntax> r0 = androidx.datastore.preferences.protobuf.ProtoSyntax.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            androidx.datastore.preferences.protobuf.ProtoSyntax r1 = (androidx.datastore.preferences.protobuf.ProtoSyntax) r1
            return r1
    }

    public static androidx.datastore.preferences.protobuf.ProtoSyntax[] values() {
            androidx.datastore.preferences.protobuf.ProtoSyntax[] r0 = androidx.datastore.preferences.protobuf.ProtoSyntax.$VALUES
            java.lang.Object r0 = r0.clone()
            androidx.datastore.preferences.protobuf.ProtoSyntax[] r0 = (androidx.datastore.preferences.protobuf.ProtoSyntax[]) r0
            return r0
    }
}
