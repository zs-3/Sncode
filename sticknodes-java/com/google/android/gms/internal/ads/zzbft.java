package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbft extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbfv {
    zzbft(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final java.lang.String zzg() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final java.util.List zzh() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 3
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.util.ArrayList r1 = com.google.android.gms.internal.ads.zzayn.zzb(r0)
            r0.recycle()
            return r1
    }
}
