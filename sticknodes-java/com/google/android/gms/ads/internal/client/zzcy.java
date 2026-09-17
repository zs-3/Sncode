package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzcy extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzcz {
    public zzcy() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            switch(r2) {
                case 1: goto L120;
                case 2: goto L112;
                case 3: goto L104;
                case 4: goto Lf6;
                case 5: goto Le0;
                case 6: goto Lca;
                case 7: goto Lbf;
                case 8: goto Lb2;
                case 9: goto La6;
                case 10: goto L97;
                case 11: goto L84;
                case 12: goto L71;
                case 13: goto L65;
                case 14: goto L52;
                case 15: goto L4a;
                case 16: goto L23;
                case 17: goto L14;
                case 18: goto L5;
                default: goto L3;
            }
        L3:
            r2 = 0
            return r2
        L5:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzt(r2)
            r4.writeNoException()
            goto L126
        L14:
            boolean r2 = com.google.android.gms.internal.ads.zzayn.zzg(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzj(r2)
            r4.writeNoException()
            goto L126
        L23:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L2b
            r2 = 0
            goto L3f
        L2b:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.ads.internal.client.zzdl
            if (r0 == 0) goto L39
            r2 = r5
            com.google.android.gms.ads.internal.client.zzdl r2 = (com.google.android.gms.ads.internal.client.zzdl) r2
            goto L3f
        L39:
            com.google.android.gms.ads.internal.client.zzdj r5 = new com.google.android.gms.ads.internal.client.zzdj
            r5.<init>(r2)
            r2 = r5
        L3f:
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzm(r2)
            r4.writeNoException()
            goto L126
        L4a:
            r1.zzi()
            r4.writeNoException()
            goto L126
        L52:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzfw> r2 = com.google.android.gms.ads.internal.client.zzfw.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            com.google.android.gms.ads.internal.client.zzfw r2 = (com.google.android.gms.ads.internal.client.zzfw) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzu(r2)
            r4.writeNoException()
            goto L126
        L65:
            java.util.List r2 = r1.zzg()
            r4.writeNoException()
            r4.writeTypedList(r2)
            goto L126
        L71:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzbmb r2 = com.google.android.gms.internal.ads.zzbma.zzc(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzs(r2)
            r4.writeNoException()
            goto L126
        L84:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpl r2 = com.google.android.gms.internal.ads.zzbpk.zzf(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzo(r2)
            r4.writeNoException()
            goto L126
        L97:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzh(r2)
            r4.writeNoException()
            goto L126
        La6:
            java.lang.String r2 = r1.zzf()
            r4.writeNoException()
            r4.writeString(r2)
            goto L126
        Lb2:
            boolean r2 = r1.zzv()
            r4.writeNoException()
            int r3 = com.google.android.gms.internal.ads.zzayn.zza
            r4.writeInt(r2)
            goto L126
        Lbf:
            float r2 = r1.zze()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L126
        Lca:
            java.lang.String r2 = r3.readString()
            android.os.IBinder r5 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r5)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzl(r2, r5)
            r4.writeNoException()
            goto L126
        Le0:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            java.lang.String r5 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzn(r2, r5)
            r4.writeNoException()
            goto L126
        Lf6:
            boolean r2 = com.google.android.gms.internal.ads.zzayn.zzg(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzp(r2)
            r4.writeNoException()
            goto L126
        L104:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzr(r2)
            r4.writeNoException()
            goto L126
        L112:
            float r2 = r3.readFloat()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzq(r2)
            r4.writeNoException()
            goto L126
        L120:
            r1.zzk()
            r4.writeNoException()
        L126:
            r2 = 1
            return r2
    }
}
