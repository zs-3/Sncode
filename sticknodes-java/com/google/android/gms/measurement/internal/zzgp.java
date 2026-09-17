package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzgp extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.measurement.internal.zzgr {
    zzgp(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.internal.IUploadBatchesCallback"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final void zze(com.google.android.gms.measurement.internal.zzpe r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r2 = 2
            r1.zzd(r2, r0)
            return
    }
}
