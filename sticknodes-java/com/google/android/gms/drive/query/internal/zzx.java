package com.google.android.gms.drive.query.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "OperatorCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class zzx extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzx> CREATOR = null;
    public static final com.google.android.gms.drive.query.internal.zzx zzmq = null;
    public static final com.google.android.gms.drive.query.internal.zzx zzmr = null;
    public static final com.google.android.gms.drive.query.internal.zzx zzms = null;
    public static final com.google.android.gms.drive.query.internal.zzx zzmt = null;
    public static final com.google.android.gms.drive.query.internal.zzx zzmu = null;
    public static final com.google.android.gms.drive.query.internal.zzx zzmv = null;
    public static final com.google.android.gms.drive.query.internal.zzx zzmw = null;
    private static final com.google.android.gms.drive.query.internal.zzx zzmx = null;
    public static final com.google.android.gms.drive.query.internal.zzx zzmy = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    private final java.lang.String tag;

    static {
            com.google.android.gms.drive.query.internal.zzy r0 = new com.google.android.gms.drive.query.internal.zzy
            r0.<init>()
            com.google.android.gms.drive.query.internal.zzx.CREATOR = r0
            com.google.android.gms.drive.query.internal.zzx r0 = new com.google.android.gms.drive.query.internal.zzx
            java.lang.String r1 = "="
            r0.<init>(r1)
            com.google.android.gms.drive.query.internal.zzx.zzmq = r0
            com.google.android.gms.drive.query.internal.zzx r0 = new com.google.android.gms.drive.query.internal.zzx
            java.lang.String r1 = "<"
            r0.<init>(r1)
            com.google.android.gms.drive.query.internal.zzx.zzmr = r0
            com.google.android.gms.drive.query.internal.zzx r0 = new com.google.android.gms.drive.query.internal.zzx
            java.lang.String r1 = "<="
            r0.<init>(r1)
            com.google.android.gms.drive.query.internal.zzx.zzms = r0
            com.google.android.gms.drive.query.internal.zzx r0 = new com.google.android.gms.drive.query.internal.zzx
            java.lang.String r1 = ">"
            r0.<init>(r1)
            com.google.android.gms.drive.query.internal.zzx.zzmt = r0
            com.google.android.gms.drive.query.internal.zzx r0 = new com.google.android.gms.drive.query.internal.zzx
            java.lang.String r1 = ">="
            r0.<init>(r1)
            com.google.android.gms.drive.query.internal.zzx.zzmu = r0
            com.google.android.gms.drive.query.internal.zzx r0 = new com.google.android.gms.drive.query.internal.zzx
            java.lang.String r1 = "and"
            r0.<init>(r1)
            com.google.android.gms.drive.query.internal.zzx.zzmv = r0
            com.google.android.gms.drive.query.internal.zzx r0 = new com.google.android.gms.drive.query.internal.zzx
            java.lang.String r1 = "or"
            r0.<init>(r1)
            com.google.android.gms.drive.query.internal.zzx.zzmw = r0
            com.google.android.gms.drive.query.internal.zzx r0 = new com.google.android.gms.drive.query.internal.zzx
            java.lang.String r1 = "not"
            r0.<init>(r1)
            com.google.android.gms.drive.query.internal.zzx.zzmx = r0
            com.google.android.gms.drive.query.internal.zzx r0 = new com.google.android.gms.drive.query.internal.zzx
            java.lang.String r1 = "contains"
            r0.<init>(r1)
            com.google.android.gms.drive.query.internal.zzx.zzmy = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzx(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.tag = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            java.lang.Class<com.google.android.gms.drive.query.internal.zzx> r2 = com.google.android.gms.drive.query.internal.zzx.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            com.google.android.gms.drive.query.internal.zzx r5 = (com.google.android.gms.drive.query.internal.zzx) r5
            java.lang.String r2 = r4.tag
            if (r2 != 0) goto L1b
            java.lang.String r5 = r5.tag
            if (r5 == 0) goto L24
            return r1
        L1b:
            java.lang.String r5 = r5.tag
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L24
            return r1
        L24:
            return r0
        L25:
            return r1
    }

    public final java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = r1.tag
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.tag
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 + 31
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.tag
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
