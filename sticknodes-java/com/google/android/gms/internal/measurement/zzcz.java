package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzcz extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzdb {
    zzcz(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void zze() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            r2.zzd(r1, r0)
            return
    }
}
