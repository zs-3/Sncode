package com.google.android.gms.drive.query.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "NotFilterCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class zzv extends com.google.android.gms.drive.query.internal.zza {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzv> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    private final com.google.android.gms.drive.query.internal.FilterHolder zzmp;

    static {
            com.google.android.gms.drive.query.internal.zzw r0 = new com.google.android.gms.drive.query.internal.zzw
            r0.<init>()
            com.google.android.gms.drive.query.internal.zzv.CREATOR = r0
            return
    }

    public zzv(com.google.android.gms.drive.query.Filter r2) {
            r1 = this;
            com.google.android.gms.drive.query.internal.FilterHolder r0 = new com.google.android.gms.drive.query.internal.FilterHolder
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzv(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.drive.query.internal.FilterHolder r1) {
            r0 = this;
            r0.<init>()
            r0.zzmp = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.query.internal.FilterHolder r1 = r4.zzmp
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @Override // com.google.android.gms.drive.query.Filter
    public final <T> T zza(com.google.android.gms.drive.query.internal.zzj<T> r2) {
            r1 = this;
            com.google.android.gms.drive.query.internal.FilterHolder r0 = r1.zzmp
            com.google.android.gms.drive.query.Filter r0 = r0.getFilter()
            java.lang.Object r0 = r0.zza(r2)
            java.lang.Object r2 = r2.zza(r0)
            return r2
    }
}
