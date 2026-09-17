package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzgm extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.measurement.internal.zzgo {
    zzgm(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.internal.ITriggerUrisCallback"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgo
    public final void zze(java.util.List r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeTypedList(r2)
            r2 = 2
            r1.zzd(r2, r0)
            return
    }
}
