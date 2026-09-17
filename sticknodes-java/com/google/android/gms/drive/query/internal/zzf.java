package com.google.android.gms.drive.query.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FieldWithSortOrderCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class zzf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzf> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    private final java.lang.String fieldName;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final boolean zzmc;

    static {
            com.google.android.gms.drive.query.internal.zzg r0 = new com.google.android.gms.drive.query.internal.zzg
            r0.<init>()
            com.google.android.gms.drive.query.internal.zzf.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzf(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) boolean r2) {
            r0 = this;
            r0.<init>()
            r0.fieldName = r1
            r0.zzmc = r2
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r4.fieldName
            r3 = 0
            r1[r3] = r2
            boolean r2 = r4.zzmc
            if (r2 == 0) goto L11
            java.lang.String r2 = "ASC"
            goto L13
        L11:
            java.lang.String r2 = "DESC"
        L13:
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "FieldWithSortOrder[%s %s]"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.fieldName
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            boolean r0 = r3.zzmc
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
