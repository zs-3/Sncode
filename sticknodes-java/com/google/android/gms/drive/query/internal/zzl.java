package com.google.android.gms.drive.query.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FullTextSearchFilterCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class zzl extends com.google.android.gms.drive.query.internal.zza {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzl> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    private final java.lang.String value;

    static {
            com.google.android.gms.drive.query.internal.zzm r0 = new com.google.android.gms.drive.query.internal.zzm
            r0.<init>()
            com.google.android.gms.drive.query.internal.zzl.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzl(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.value
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    @Override // com.google.android.gms.drive.query.Filter
    public final <F> F zza(com.google.android.gms.drive.query.internal.zzj<F> r2) {
            r1 = this;
            java.lang.String r0 = r1.value
            java.lang.Object r2 = r2.zzi(r0)
            return r2
    }
}
