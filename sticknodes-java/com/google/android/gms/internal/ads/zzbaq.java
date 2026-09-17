package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbaq extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbar {
    public zzbaq() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbar zze(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbar
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbar r0 = (com.google.android.gms.internal.ads.zzbar) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbap r0 = new com.google.android.gms.internal.ads.zzbap
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L21
            r0 = 2
            if (r3 == r0) goto L1a
            r0 = 3
            if (r3 == r0) goto Lb
            r3 = 0
            return r3
        Lb:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zze> r3 = com.google.android.gms.ads.internal.client.zze.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayn.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zze r3 = (com.google.android.gms.ads.internal.client.zze) r3
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzc(r3)
            goto L43
        L1a:
            r4.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            goto L43
        L21:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L29
            r3 = 0
            goto L3d
        L29:
            java.lang.String r0 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbao
            if (r1 == 0) goto L37
            r3 = r0
            com.google.android.gms.internal.ads.zzbao r3 = (com.google.android.gms.internal.ads.zzbao) r3
            goto L3d
        L37:
            com.google.android.gms.internal.ads.zzbam r0 = new com.google.android.gms.internal.ads.zzbam
            r0.<init>(r3)
            r3 = r0
        L3d:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzd(r3)
        L43:
            r5.writeNoException()
            return r6
    }
}
