package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbhi extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbhj {
    public zzbhi() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbhj zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbhj
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbhj r0 = (com.google.android.gms.internal.ads.zzbhj) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbhh r0 = new com.google.android.gms.internal.ads.zzbhh
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            r2 = this;
            r6 = 1
            if (r3 != r6) goto L29
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto Lb
            r3 = 0
            goto L1f
        Lb:
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbgw
            if (r1 == 0) goto L19
            r3 = r0
            com.google.android.gms.internal.ads.zzbgw r3 = (com.google.android.gms.internal.ads.zzbgw) r3
            goto L1f
        L19:
            com.google.android.gms.internal.ads.zzbgu r0 = new com.google.android.gms.internal.ads.zzbgu
            r0.<init>(r3)
            r3 = r0
        L1f:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zze(r3)
            r5.writeNoException()
            return r6
        L29:
            r3 = 0
            return r3
    }
}
