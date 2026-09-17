package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzdc extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzdd {
    public zzdc() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IMuteThisAdListener"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.ads.internal.client.zzdd zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IMuteThisAdListener"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.internal.client.zzdd
            if (r1 == 0) goto L11
            com.google.android.gms.ads.internal.client.zzdd r0 = (com.google.android.gms.ads.internal.client.zzdd) r0
            return r0
        L11:
            com.google.android.gms.ads.internal.client.zzdb r0 = new com.google.android.gms.ads.internal.client.zzdb
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r2 = 1
            if (r1 != r2) goto La
            r0.zze()
            r3.writeNoException()
            return r2
        La:
            r1 = 0
            return r1
    }
}
