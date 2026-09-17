package com.google.android.gms.internal.appset;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public final class zzg extends com.google.android.gms.internal.appset.zza {
    zzg(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.appset.internal.IAppSetService"
            r1.<init>(r2, r0)
            return
    }

    public final void zzc(com.google.android.gms.appset.zza r2, com.google.android.gms.internal.appset.zzf r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.appset.zzc.zzb(r0, r2)
            com.google.android.gms.internal.appset.zzc.zzc(r0, r3)
            r2 = 1
            r1.zzb(r2, r0)
            return
    }
}
