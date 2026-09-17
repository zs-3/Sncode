package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbpj extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbpl {
    zzbpj(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final com.google.android.gms.internal.ads.zzbpo zzb(java.lang.String r4) throws android.os.RemoteException {
            r3 = this;
            android.os.Parcel r0 = r3.zza()
            r0.writeString(r4)
            r4 = 1
            android.os.Parcel r4 = r3.zzdb(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L14
            r0 = 0
            goto L28
        L14:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzbpo
            if (r2 == 0) goto L22
            r0 = r1
            com.google.android.gms.internal.ads.zzbpo r0 = (com.google.android.gms.internal.ads.zzbpo) r0
            goto L28
        L22:
            com.google.android.gms.internal.ads.zzbpm r1 = new com.google.android.gms.internal.ads.zzbpm
            r1.<init>(r0)
            r0 = r1
        L28:
            r4.recycle()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final com.google.android.gms.internal.ads.zzbrk zzc(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r2 = 3
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            android.os.IBinder r0 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzbrk r0 = com.google.android.gms.internal.ads.zzbrj.zzb(r0)
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final boolean zzd(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r2 = 4
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            boolean r0 = com.google.android.gms.internal.ads.zzayn.zzg(r2)
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final boolean zze(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r2 = 2
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            boolean r0 = com.google.android.gms.internal.ads.zzayn.zzg(r2)
            r2.recycle()
            return r0
    }
}
