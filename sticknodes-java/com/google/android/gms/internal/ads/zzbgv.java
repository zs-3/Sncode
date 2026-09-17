package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbgv extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbgw {
    public zzbgv() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbgw zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbgw
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbgw r0 = (com.google.android.gms.internal.ads.zzbgw) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbgu r0 = new com.google.android.gms.internal.ads.zzbgu
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            switch(r1) {
                case 1: goto Ld8;
                case 2: goto Lc6;
                case 3: goto Lbb;
                case 4: goto Lb0;
                case 5: goto La2;
                case 6: goto L9b;
                case 7: goto L90;
                case 8: goto L89;
                case 9: goto L7e;
                case 10: goto L68;
                case 11: goto L5f;
                case 12: goto L51;
                case 13: goto L43;
                case 14: goto L30;
                case 15: goto L28;
                case 16: goto L1c;
                case 17: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            boolean r1 = r0.zzr(r1)
            r3.writeNoException()
            r3.writeInt(r1)
            goto Le9
        L1c:
            com.google.android.gms.internal.ads.zzbfz r1 = r0.zzf()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            goto Le9
        L28:
            r0.zzm()
            r3.writeNoException()
            goto Le9
        L30:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzp(r1)
            r3.writeNoException()
            goto Le9
        L43:
            boolean r1 = r0.zzt()
            r3.writeNoException()
            int r2 = com.google.android.gms.internal.ads.zzayn.zza
            r3.writeInt(r1)
            goto Le9
        L51:
            boolean r1 = r0.zzq()
            r3.writeNoException()
            int r2 = com.google.android.gms.internal.ads.zzayn.zza
            r3.writeInt(r1)
            goto Le9
        L5f:
            r3.writeNoException()
            r1 = 0
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            goto Le9
        L68:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            boolean r1 = r0.zzs(r1)
            r3.writeNoException()
            r3.writeInt(r1)
            goto Le9
        L7e:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzh()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            goto Le9
        L89:
            r0.zzl()
            r3.writeNoException()
            goto Le9
        L90:
            com.google.android.gms.ads.internal.client.zzeb r1 = r0.zze()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            goto Le9
        L9b:
            r0.zzo()
            r3.writeNoException()
            goto Le9
        La2:
            java.lang.String r1 = r2.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzn(r1)
            r3.writeNoException()
            goto Le9
        Lb0:
            java.lang.String r1 = r0.zzi()
            r3.writeNoException()
            r3.writeString(r1)
            goto Le9
        Lbb:
            java.util.List r1 = r0.zzk()
            r3.writeNoException()
            r3.writeStringList(r1)
            goto Le9
        Lc6:
            java.lang.String r1 = r2.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            com.google.android.gms.internal.ads.zzbgc r1 = r0.zzg(r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            goto Le9
        Ld8:
            java.lang.String r1 = r2.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            java.lang.String r1 = r0.zzj(r1)
            r3.writeNoException()
            r3.writeString(r1)
        Le9:
            r1 = 1
            return r1
    }
}
