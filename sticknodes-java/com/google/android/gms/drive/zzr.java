package com.google.android.gms.drive;

@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PermissionCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.zzr> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAccountType", id = 3)
    private int accountType;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAccountIdentifier", id = 2)
    private java.lang.String zzbg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAccountDisplayName", id = 4)
    private java.lang.String zzbh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPhotoLink", id = 5)
    private java.lang.String zzbi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRole", id = 6)
    private int zzbj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isLinkRequiredForAccess", id = 7)
    private boolean zzbk;

    static {
            com.google.android.gms.drive.zzs r0 = new com.google.android.gms.drive.zzs
            r0.<init>()
            com.google.android.gms.drive.zzr.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzr(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) boolean r6) {
            r0 = this;
            r0.<init>()
            r0.zzbg = r1
            r0.accountType = r2
            r0.zzbh = r3
            r0.zzbi = r4
            r0.zzbj = r5
            r0.zzbk = r6
            return
    }

    private static boolean zzb(int r0) {
            switch(r0) {
                case 256: goto L5;
                case 257: goto L5;
                case 258: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            r0 = 1
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L2f
            java.lang.Class r1 = r5.getClass()
            java.lang.Class<com.google.android.gms.drive.zzr> r2 = com.google.android.gms.drive.zzr.class
            if (r1 == r2) goto Lc
            goto L2f
        Lc:
            r1 = 1
            if (r5 != r4) goto L10
            return r1
        L10:
            com.google.android.gms.drive.zzr r5 = (com.google.android.gms.drive.zzr) r5
            java.lang.String r2 = r4.zzbg
            java.lang.String r3 = r5.zzbg
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L2f
            int r2 = r4.accountType
            int r3 = r5.accountType
            if (r2 != r3) goto L2f
            int r2 = r4.zzbj
            int r3 = r5.zzbj
            if (r2 != r3) goto L2f
            boolean r2 = r4.zzbk
            boolean r5 = r5.zzbk
            if (r2 != r5) goto L2f
            return r1
        L2f:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.zzbg
            r2 = 0
            r0[r2] = r1
            int r1 = r3.accountType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.zzbj
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            boolean r1 = r3.zzbk
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r8, int r9) {
            r7 = this;
            int r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r8)
            int r0 = r7.accountType
            boolean r0 = zzb(r0)
            if (r0 != 0) goto Le
            r0 = 0
            goto L10
        Le:
            java.lang.String r0 = r7.zzbg
        L10:
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r8, r1, r0, r2)
            int r0 = r7.accountType
            boolean r0 = zzb(r0)
            r3 = -1
            if (r0 != 0) goto L20
            r0 = -1
            goto L22
        L20:
            int r0 = r7.accountType
        L22:
            r4 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r8, r4, r0)
            r0 = 4
            java.lang.String r5 = r7.zzbh
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r8, r0, r5, r2)
            r0 = 5
            java.lang.String r5 = r7.zzbi
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r8, r0, r5, r2)
            r0 = 6
            int r5 = r7.zzbj
            r6 = 1
            if (r5 == 0) goto L3f
            if (r5 == r6) goto L3f
            if (r5 == r1) goto L3f
            if (r5 == r4) goto L3f
            goto L40
        L3f:
            r2 = 1
        L40:
            if (r2 != 0) goto L43
            goto L44
        L43:
            r3 = r5
        L44:
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r8, r0, r3)
            r0 = 7
            boolean r1 = r7.zzbk
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r8, r0, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r8, r9)
            return
    }
}
