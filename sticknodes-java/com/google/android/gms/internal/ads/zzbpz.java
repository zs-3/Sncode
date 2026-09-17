package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbpz extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbqa {
    public zzbpz() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbqa zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbqa
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbqa r0 = (com.google.android.gms.internal.ads.zzbqa) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbpy r0 = new com.google.android.gms.internal.ads.zzbpy
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            switch(r2) {
                case 2: goto L132;
                case 3: goto L127;
                case 4: goto L11c;
                case 5: goto L111;
                case 6: goto L106;
                case 7: goto Lfb;
                case 8: goto Lf0;
                case 9: goto Le5;
                case 10: goto Lda;
                case 11: goto Lcf;
                case 12: goto Lc6;
                case 13: goto Lba;
                case 14: goto Lae;
                case 15: goto La2;
                case 16: goto L96;
                case 17: goto L88;
                case 18: goto L7a;
                case 19: goto L72;
                case 20: goto L5f;
                case 21: goto L3c;
                case 22: goto L29;
                case 23: goto L1d;
                case 24: goto L11;
                case 25: goto L5;
                default: goto L3;
            }
        L3:
            r2 = 0
            return r2
        L5:
            float r2 = r1.zzg()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L13c
        L11:
            float r2 = r1.zzh()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L13c
        L1d:
            float r2 = r1.zzf()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L13c
        L29:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzz(r2)
            r4.writeNoException()
            goto L13c
        L3c:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            android.os.IBinder r5 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r5)
            android.os.IBinder r0 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzy(r2, r5, r0)
            r4.writeNoException()
            goto L13c
        L5f:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzw(r2)
            r4.writeNoException()
            goto L13c
        L72:
            r1.zzx()
            r4.writeNoException()
            goto L13c
        L7a:
            boolean r2 = r1.zzA()
            r4.writeNoException()
            int r3 = com.google.android.gms.internal.ads.zzayn.zza
            r4.writeInt(r2)
            goto L13c
        L88:
            boolean r2 = r1.zzB()
            r4.writeNoException()
            int r3 = com.google.android.gms.internal.ads.zzayn.zza
            r4.writeInt(r2)
            goto L13c
        L96:
            android.os.Bundle r2 = r1.zzi()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r4, r2)
            goto L13c
        La2:
            com.google.android.gms.dynamic.IObjectWrapper r2 = r1.zzo()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L13c
        Lae:
            com.google.android.gms.dynamic.IObjectWrapper r2 = r1.zzn()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L13c
        Lba:
            com.google.android.gms.dynamic.IObjectWrapper r2 = r1.zzm()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L13c
        Lc6:
            r4.writeNoException()
            r2 = 0
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L13c
        Lcf:
            com.google.android.gms.ads.internal.client.zzeb r2 = r1.zzj()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L13c
        Lda:
            java.lang.String r2 = r1.zzt()
            r4.writeNoException()
            r4.writeString(r2)
            goto L13c
        Le5:
            java.lang.String r2 = r1.zzu()
            r4.writeNoException()
            r4.writeString(r2)
            goto L13c
        Lf0:
            double r2 = r1.zze()
            r4.writeNoException()
            r4.writeDouble(r2)
            goto L13c
        Lfb:
            java.lang.String r2 = r1.zzp()
            r4.writeNoException()
            r4.writeString(r2)
            goto L13c
        L106:
            java.lang.String r2 = r1.zzr()
            r4.writeNoException()
            r4.writeString(r2)
            goto L13c
        L111:
            com.google.android.gms.internal.ads.zzbgc r2 = r1.zzl()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L13c
        L11c:
            java.lang.String r2 = r1.zzq()
            r4.writeNoException()
            r4.writeString(r2)
            goto L13c
        L127:
            java.util.List r2 = r1.zzv()
            r4.writeNoException()
            r4.writeList(r2)
            goto L13c
        L132:
            java.lang.String r2 = r1.zzs()
            r4.writeNoException()
            r4.writeString(r2)
        L13c:
            r2 = 1
            return r2
    }
}
