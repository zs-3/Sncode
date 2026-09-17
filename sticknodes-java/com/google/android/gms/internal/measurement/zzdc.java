package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzdc extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzde {
    zzdc(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final int zze() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            android.os.Parcel r0 = r2.zzb(r1, r0)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final void zzf(java.lang.String r2, java.lang.String r3, android.os.Bundle r4, long r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r4)
            r0.writeLong(r5)
            r2 = 1
            r1.zzc(r2, r0)
            return
    }
}
