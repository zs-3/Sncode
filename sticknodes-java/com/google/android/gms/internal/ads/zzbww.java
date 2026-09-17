package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbww extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbwx {
    public zzbww() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbwx zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbwx
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbwx r0 = (com.google.android.gms.internal.ads.zzbwx) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbwv r0 = new com.google.android.gms.internal.ads.zzbwv
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            switch(r1) {
                case 1: goto Lbc;
                case 2: goto La9;
                case 3: goto L9a;
                case 4: goto L8b;
                case 5: goto L7c;
                case 6: goto L6d;
                case 7: goto L56;
                case 8: goto L46;
                case 9: goto L32;
                case 10: goto L22;
                case 11: goto L12;
                case 12: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            goto Lca
        L12:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzn(r1)
            goto Lca
        L22:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzh(r1)
            goto Lca
        L32:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            int r4 = r2.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzg(r1, r4)
            goto Lca
        L46:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zze(r1)
            goto Lca
        L56:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbwy> r4 = com.google.android.gms.internal.ads.zzbwy.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzayn.zza(r2, r4)
            com.google.android.gms.internal.ads.zzbwy r4 = (com.google.android.gms.internal.ads.zzbwy) r4
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzm(r1, r4)
            goto Lca
        L6d:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzf(r1)
            goto Lca
        L7c:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzo(r1)
            goto Lca
        L8b:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzj(r1)
            goto Lca
        L9a:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzi(r1)
            goto Lca
        La9:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            int r4 = r2.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzk(r1, r4)
            goto Lca
        Lbc:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzl(r1)
        Lca:
            r3.writeNoException()
            r1 = 1
            return r1
    }
}
