package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzed extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzee {
    public zzed() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L28
            r0 = 2
            if (r2 == r0) goto L24
            r0 = 3
            if (r2 == r0) goto L20
            r0 = 4
            if (r2 == r0) goto L1c
            r0 = 5
            if (r2 == r0) goto L11
            r2 = 0
            return r2
        L11:
            boolean r2 = com.google.android.gms.internal.ads.zzayn.zzg(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzf(r2)
            goto L2b
        L1c:
            r1.zze()
            goto L2b
        L20:
            r1.zzg()
            goto L2b
        L24:
            r1.zzh()
            goto L2b
        L28:
            r1.zzi()
        L2b:
            r4.writeNoException()
            return r5
    }
}
