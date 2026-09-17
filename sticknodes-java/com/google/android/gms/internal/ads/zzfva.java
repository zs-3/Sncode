package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfva extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzfvc {
    zzfva(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.play.core.lmd.protocol.ILmdOverlayService"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final void zze(android.os.Bundle r2, com.google.android.gms.internal.ads.zzfve r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            r2 = 2
            r1.zzdd(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final void zzf(java.lang.String r2, android.os.Bundle r3, com.google.android.gms.internal.ads.zzfve r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r4)
            r2 = 1
            r1.zzdd(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final void zzg(android.os.Bundle r2, com.google.android.gms.internal.ads.zzfve r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            r2 = 3
            r1.zzdd(r2, r0)
            return
    }
}
