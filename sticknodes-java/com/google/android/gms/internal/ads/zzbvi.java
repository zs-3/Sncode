package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbvi extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbvj {
    public zzbvi() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.request.IAdRequestService"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            r3 = this;
            r7 = 1
            r0 = 0
            if (r4 == r7) goto Ldb
            r1 = 2
            if (r4 == r1) goto Lb9
            r1 = 4
            java.lang.String r2 = "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"
            if (r4 == r1) goto L90
            r1 = 5
            if (r4 == r1) goto L67
            r1 = 6
            if (r4 == r1) goto L3d
            r1 = 7
            if (r4 == r1) goto L17
            r4 = 0
            return r4
        L17:
            java.lang.String r4 = r5.readString()
            android.os.IBinder r1 = r5.readStrongBinder()
            if (r1 != 0) goto L22
            goto L32
        L22:
            android.os.IInterface r0 = r1.queryLocalInterface(r2)
            boolean r2 = r0 instanceof com.google.android.gms.internal.ads.zzbvt
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.zzbvt r0 = (com.google.android.gms.internal.ads.zzbvt) r0
            goto L32
        L2d:
            com.google.android.gms.internal.ads.zzbvr r0 = new com.google.android.gms.internal.ads.zzbvr
            r0.<init>(r1)
        L32:
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r3.zzh(r4, r0)
            r6.writeNoException()
            goto Lec
        L3d:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbwa> r4 = com.google.android.gms.internal.ads.zzbwa.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzayn.zza(r5, r4)
            com.google.android.gms.internal.ads.zzbwa r4 = (com.google.android.gms.internal.ads.zzbwa) r4
            android.os.IBinder r1 = r5.readStrongBinder()
            if (r1 != 0) goto L4c
            goto L5c
        L4c:
            android.os.IInterface r0 = r1.queryLocalInterface(r2)
            boolean r2 = r0 instanceof com.google.android.gms.internal.ads.zzbvt
            if (r2 == 0) goto L57
            com.google.android.gms.internal.ads.zzbvt r0 = (com.google.android.gms.internal.ads.zzbvt) r0
            goto L5c
        L57:
            com.google.android.gms.internal.ads.zzbvr r0 = new com.google.android.gms.internal.ads.zzbvr
            r0.<init>(r1)
        L5c:
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r3.zze(r4, r0)
            r6.writeNoException()
            goto Lec
        L67:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbwa> r4 = com.google.android.gms.internal.ads.zzbwa.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzayn.zza(r5, r4)
            com.google.android.gms.internal.ads.zzbwa r4 = (com.google.android.gms.internal.ads.zzbwa) r4
            android.os.IBinder r1 = r5.readStrongBinder()
            if (r1 != 0) goto L76
            goto L86
        L76:
            android.os.IInterface r0 = r1.queryLocalInterface(r2)
            boolean r2 = r0 instanceof com.google.android.gms.internal.ads.zzbvt
            if (r2 == 0) goto L81
            com.google.android.gms.internal.ads.zzbvt r0 = (com.google.android.gms.internal.ads.zzbvt) r0
            goto L86
        L81:
            com.google.android.gms.internal.ads.zzbvr r0 = new com.google.android.gms.internal.ads.zzbvr
            r0.<init>(r1)
        L86:
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r3.zzf(r4, r0)
            r6.writeNoException()
            goto Lec
        L90:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbwa> r4 = com.google.android.gms.internal.ads.zzbwa.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzayn.zza(r5, r4)
            com.google.android.gms.internal.ads.zzbwa r4 = (com.google.android.gms.internal.ads.zzbwa) r4
            android.os.IBinder r1 = r5.readStrongBinder()
            if (r1 != 0) goto L9f
            goto Laf
        L9f:
            android.os.IInterface r0 = r1.queryLocalInterface(r2)
            boolean r2 = r0 instanceof com.google.android.gms.internal.ads.zzbvt
            if (r2 == 0) goto Laa
            com.google.android.gms.internal.ads.zzbvt r0 = (com.google.android.gms.internal.ads.zzbvt) r0
            goto Laf
        Laa:
            com.google.android.gms.internal.ads.zzbvr r0 = new com.google.android.gms.internal.ads.zzbvr
            r0.<init>(r1)
        Laf:
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r3.zzg(r4, r0)
            r6.writeNoException()
            goto Lec
        Lb9:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbuy> r4 = com.google.android.gms.internal.ads.zzbuy.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzayn.zza(r5, r4)
            com.google.android.gms.internal.ads.zzbuy r4 = (com.google.android.gms.internal.ads.zzbuy) r4
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto Lc8
            goto Ld4
        Lc8:
            java.lang.String r0 = "com.google.android.gms.ads.internal.request.IAdResponseListener"
            android.os.IInterface r4 = r4.queryLocalInterface(r0)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzbvk
            if (r0 == 0) goto Ld4
            com.google.android.gms.internal.ads.zzbvk r4 = (com.google.android.gms.internal.ads.zzbvk) r4
        Ld4:
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r6.writeNoException()
            goto Lec
        Ldb:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbuy> r4 = com.google.android.gms.internal.ads.zzbuy.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzayn.zza(r5, r4)
            com.google.android.gms.internal.ads.zzbuy r4 = (com.google.android.gms.internal.ads.zzbuy) r4
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r6, r0)
        Lec:
            return r7
    }
}
