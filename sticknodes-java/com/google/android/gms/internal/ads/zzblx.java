package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzblx extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbly {
    public zzblx() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbly zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbly
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbly r0 = (com.google.android.gms.internal.ads.zzbly) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzblw r0 = new com.google.android.gms.internal.ads.zzblw
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r4 = 2
            if (r1 == r4) goto L13
            r4 = 3
            if (r1 == r4) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = r2.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zze(r1)
            goto L16
        L13:
            r0.zzf()
        L16:
            r3.writeNoException()
            r1 = 1
            return r1
    }
}
