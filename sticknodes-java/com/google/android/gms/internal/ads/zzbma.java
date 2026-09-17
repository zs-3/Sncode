package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbma extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbmb {
    public zzbma() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.initialization.IInitializationCallback"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbmb zzc(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.initialization.IInitializationCallback"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbmb
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbmb r0 = (com.google.android.gms.internal.ads.zzbmb) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzblz r0 = new com.google.android.gms.internal.ads.zzblz
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r4 = 1
            if (r1 != r4) goto L13
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzblu> r1 = com.google.android.gms.internal.ads.zzblu.CREATOR
            java.util.ArrayList r1 = r2.createTypedArrayList(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzb(r1)
            r3.writeNoException()
            return r4
        L13:
            r1 = 0
            return r1
    }
}
