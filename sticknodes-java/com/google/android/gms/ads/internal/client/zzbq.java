package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbq extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzbr {
    public zzbq() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdLoader"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L4a
            r0 = 2
            if (r2 == r0) goto L3f
            r0 = 3
            if (r2 == r0) goto L32
            r0 = 4
            if (r2 == r0) goto L27
            r0 = 5
            if (r2 == r0) goto L11
            r2 = 0
            return r2
        L11:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r2 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            com.google.android.gms.ads.internal.client.zzm r2 = (com.google.android.gms.ads.internal.client.zzm) r2
            int r0 = r3.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzh(r2, r0)
            r4.writeNoException()
            goto L5b
        L27:
            java.lang.String r2 = r1.zzf()
            r4.writeNoException()
            r4.writeString(r2)
            goto L5b
        L32:
            boolean r2 = r1.zzi()
            r4.writeNoException()
            int r3 = com.google.android.gms.internal.ads.zzayn.zza
            r4.writeInt(r2)
            goto L5b
        L3f:
            java.lang.String r2 = r1.zze()
            r4.writeNoException()
            r4.writeString(r2)
            goto L5b
        L4a:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r2 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            com.google.android.gms.ads.internal.client.zzm r2 = (com.google.android.gms.ads.internal.client.zzm) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzg(r2)
            r4.writeNoException()
        L5b:
            return r5
    }
}
