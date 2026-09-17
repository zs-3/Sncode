package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "UploadBatchesParcelCreator")
/* loaded from: classes2.dex */
public final class zzpe extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzpe> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final java.util.List zza;

    static {
            com.google.android.gms.measurement.internal.zzpf r0 = new com.google.android.gms.measurement.internal.zzpf
            r0.<init>()
            com.google.android.gms.measurement.internal.zzpe.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzpe(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.util.List r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r5, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
