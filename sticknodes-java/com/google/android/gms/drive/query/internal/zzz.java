package com.google.android.gms.drive.query.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "OwnedByMeFilterCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class zzz extends com.google.android.gms.drive.query.internal.zza {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzz> CREATOR = null;

    static {
            com.google.android.gms.drive.query.internal.zzaa r0 = new com.google.android.gms.drive.query.internal.zzaa
            r0.<init>()
            com.google.android.gms.drive.query.internal.zzz.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzz() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r1, r2)
            return
    }

    @Override // com.google.android.gms.drive.query.Filter
    public final <F> F zza(com.google.android.gms.drive.query.internal.zzj<F> r1) {
            r0 = this;
            java.lang.Object r1 = r1.zzbj()
            return r1
    }
}
