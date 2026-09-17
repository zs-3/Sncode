package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbgu extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbgw {
    zzbgu(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final com.google.android.gms.ads.internal.client.zzeb zze() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final com.google.android.gms.internal.ads.zzbfz zzf() throws android.os.RemoteException {
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 16
            android.os.Parcel r0 = r4.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L12
            r1 = 0
            goto L26
        L12:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbfz
            if (r3 == 0) goto L20
            r1 = r2
            com.google.android.gms.internal.ads.zzbfz r1 = (com.google.android.gms.internal.ads.zzbfz) r1
            goto L26
        L20:
            com.google.android.gms.internal.ads.zzbfx r2 = new com.google.android.gms.internal.ads.zzbfx
            r2.<init>(r1)
            r1 = r2
        L26:
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final com.google.android.gms.internal.ads.zzbgc zzg(java.lang.String r4) throws android.os.RemoteException {
            r3 = this;
            android.os.Parcel r0 = r3.zza()
            r0.writeString(r4)
            r4 = 2
            android.os.Parcel r4 = r3.zzdb(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L14
            r0 = 0
            goto L28
        L14:
            java.lang.String r1 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzbgc
            if (r2 == 0) goto L22
            r0 = r1
            com.google.android.gms.internal.ads.zzbgc r0 = (com.google.android.gms.internal.ads.zzbgc) r0
            goto L28
        L22:
            com.google.android.gms.internal.ads.zzbga r1 = new com.google.android.gms.internal.ads.zzbga
            r1.<init>(r0)
            r0 = r1
        L28:
            r4.recycle()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final com.google.android.gms.dynamic.IObjectWrapper zzh() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 9
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final java.lang.String zzi() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 4
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final java.lang.String zzj(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r2 = 1
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            java.lang.String r0 = r2.readString()
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final java.util.List zzk() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 3
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.util.ArrayList r1 = r0.createStringArrayList()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zzl() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 8
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zzm() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 15
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zzn(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r2 = 5
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zzo() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 6
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zzp(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 14
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final boolean zzq() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 12
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            boolean r1 = com.google.android.gms.internal.ads.zzayn.zzg(r0)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final boolean zzr(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 17
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            boolean r0 = com.google.android.gms.internal.ads.zzayn.zzg(r2)
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final boolean zzs(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 10
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            boolean r0 = com.google.android.gms.internal.ads.zzayn.zzg(r2)
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final boolean zzt() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 13
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            boolean r1 = com.google.android.gms.internal.ads.zzayn.zzg(r0)
            r0.recycle()
            return r1
    }
}
