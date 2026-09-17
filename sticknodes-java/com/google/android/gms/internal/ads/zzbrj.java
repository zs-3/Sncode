package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbrj extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbrk {
    public zzbrj() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbrk zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbrk
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbrk r0 = (com.google.android.gms.internal.ads.zzbrk) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbri r0 = new com.google.android.gms.internal.ads.zzbri
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r15, android.os.Parcel r16, android.os.Parcel r17, int r18) throws android.os.RemoteException {
            r14 = this;
            r8 = r14
            r0 = r15
            r1 = r16
            r9 = r17
            r10 = 1
            r2 = 0
            if (r0 == r10) goto L33e
            r3 = 2
            if (r0 == r3) goto L333
            r3 = 3
            if (r0 == r3) goto L328
            r3 = 5
            if (r0 == r3) goto L31c
            r3 = 10
            if (r0 == r3) goto L30d
            r3 = 11
            if (r0 == r3) goto L2fa
            java.lang.String r3 = "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback"
            java.lang.String r4 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback"
            java.lang.String r5 = "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback"
            switch(r0) {
                case 13: goto L2a5;
                case 14: goto L257;
                case 15: goto L240;
                case 16: goto L1f4;
                case 17: goto L1dd;
                case 18: goto L191;
                case 19: goto L182;
                case 20: goto L136;
                case 21: goto Le1;
                case 22: goto L8b;
                case 23: goto L3d;
                case 24: goto L26;
                default: goto L24;
            }
        L24:
            r0 = 0
            return r0
        L26:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            boolean r0 = r14.zzr(r0)
            r17.writeNoException()
            r9.writeInt(r0)
            goto L38d
        L3d:
            java.lang.String r3 = r16.readString()
            java.lang.String r4 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r0 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r1, r0)
            r5 = r0
            com.google.android.gms.ads.internal.client.zzm r5 = (com.google.android.gms.ads.internal.client.zzm) r5
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L5e
        L5c:
            r7 = r2
            goto L71
        L5e:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzbqv
            if (r7 == 0) goto L6b
            com.google.android.gms.internal.ads.zzbqv r2 = (com.google.android.gms.internal.ads.zzbqv) r2
            goto L5c
        L6b:
            com.google.android.gms.internal.ads.zzbqt r2 = new com.google.android.gms.internal.ads.zzbqt
            r2.<init>(r0)
            goto L5c
        L71:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpr r11 = com.google.android.gms.internal.ads.zzbpq.zzb(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            r0 = r14
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.zzi(r1, r2, r3, r4, r5, r6)
            r17.writeNoException()
            goto L38d
        L8b:
            java.lang.String r4 = r16.readString()
            java.lang.String r5 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r0 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r1, r0)
            r6 = r0
            com.google.android.gms.ads.internal.client.zzm r6 = (com.google.android.gms.ads.internal.client.zzm) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto Lac
        Laa:
            r11 = r2
            goto Lbd
        Lac:
            android.os.IInterface r2 = r0.queryLocalInterface(r3)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbre
            if (r3 == 0) goto Lb7
            com.google.android.gms.internal.ads.zzbre r2 = (com.google.android.gms.internal.ads.zzbre) r2
            goto Laa
        Lb7:
            com.google.android.gms.internal.ads.zzbrc r2 = new com.google.android.gms.internal.ads.zzbrc
            r2.<init>(r0)
            goto Laa
        Lbd:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpr r12 = com.google.android.gms.internal.ads.zzbpq.zzb(r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfr> r0 = com.google.android.gms.internal.ads.zzbfr.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r1, r0)
            r13 = r0
            com.google.android.gms.internal.ads.zzbfr r13 = (com.google.android.gms.internal.ads.zzbfr) r13
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            r0 = r14
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r11
            r6 = r12
            r7 = r13
            r0.zzn(r1, r2, r3, r4, r5, r6, r7)
            r17.writeNoException()
            goto L38d
        Le1:
            java.lang.String r3 = r16.readString()
            java.lang.String r4 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r0 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r1, r0)
            r6 = r0
            com.google.android.gms.ads.internal.client.zzm r6 = (com.google.android.gms.ads.internal.client.zzm) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L102
        L100:
            r5 = r2
            goto L113
        L102:
            android.os.IInterface r2 = r0.queryLocalInterface(r5)
            boolean r5 = r2 instanceof com.google.android.gms.internal.ads.zzbqy
            if (r5 == 0) goto L10d
            com.google.android.gms.internal.ads.zzbqy r2 = (com.google.android.gms.internal.ads.zzbqy) r2
            goto L100
        L10d:
            com.google.android.gms.internal.ads.zzbqw r2 = new com.google.android.gms.internal.ads.zzbqw
            r2.<init>(r0)
            goto L100
        L113:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpr r11 = com.google.android.gms.internal.ads.zzbpq.zzb(r0)
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzs> r0 = com.google.android.gms.ads.internal.client.zzs.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r1, r0)
            r12 = r0
            com.google.android.gms.ads.internal.client.zzs r12 = (com.google.android.gms.ads.internal.client.zzs) r12
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            r0 = r14
            r1 = r3
            r2 = r4
            r3 = r6
            r4 = r7
            r6 = r11
            r7 = r12
            r0.zzk(r1, r2, r3, r4, r5, r6, r7)
            r17.writeNoException()
            goto L38d
        L136:
            java.lang.String r3 = r16.readString()
            java.lang.String r5 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r0 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r1, r0)
            r6 = r0
            com.google.android.gms.ads.internal.client.zzm r6 = (com.google.android.gms.ads.internal.client.zzm) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L157
        L155:
            r11 = r2
            goto L168
        L157:
            android.os.IInterface r2 = r0.queryLocalInterface(r4)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzbrh
            if (r4 == 0) goto L162
            com.google.android.gms.internal.ads.zzbrh r2 = (com.google.android.gms.internal.ads.zzbrh) r2
            goto L155
        L162:
            com.google.android.gms.internal.ads.zzbrf r2 = new com.google.android.gms.internal.ads.zzbrf
            r2.<init>(r0)
            goto L155
        L168:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpr r12 = com.google.android.gms.internal.ads.zzbpq.zzb(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            r0 = r14
            r1 = r3
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r11
            r6 = r12
            r0.zzo(r1, r2, r3, r4, r5, r6)
            r17.writeNoException()
            goto L38d
        L182:
            java.lang.String r0 = r16.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            r14.zzq(r0)
            r17.writeNoException()
            goto L38d
        L191:
            java.lang.String r4 = r16.readString()
            java.lang.String r5 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r0 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r1, r0)
            r6 = r0
            com.google.android.gms.ads.internal.client.zzm r6 = (com.google.android.gms.ads.internal.client.zzm) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L1b2
        L1b0:
            r11 = r2
            goto L1c3
        L1b2:
            android.os.IInterface r2 = r0.queryLocalInterface(r3)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbre
            if (r3 == 0) goto L1bd
            com.google.android.gms.internal.ads.zzbre r2 = (com.google.android.gms.internal.ads.zzbre) r2
            goto L1b0
        L1bd:
            com.google.android.gms.internal.ads.zzbrc r2 = new com.google.android.gms.internal.ads.zzbrc
            r2.<init>(r0)
            goto L1b0
        L1c3:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpr r12 = com.google.android.gms.internal.ads.zzbpq.zzb(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            r0 = r14
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r11
            r6 = r12
            r0.zzm(r1, r2, r3, r4, r5, r6)
            r17.writeNoException()
            goto L38d
        L1dd:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            boolean r0 = r14.zzt(r0)
            r17.writeNoException()
            r9.writeInt(r0)
            goto L38d
        L1f4:
            java.lang.String r3 = r16.readString()
            java.lang.String r5 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r0 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r1, r0)
            r6 = r0
            com.google.android.gms.ads.internal.client.zzm r6 = (com.google.android.gms.ads.internal.client.zzm) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L215
        L213:
            r11 = r2
            goto L226
        L215:
            android.os.IInterface r2 = r0.queryLocalInterface(r4)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzbrh
            if (r4 == 0) goto L220
            com.google.android.gms.internal.ads.zzbrh r2 = (com.google.android.gms.internal.ads.zzbrh) r2
            goto L213
        L220:
            com.google.android.gms.internal.ads.zzbrf r2 = new com.google.android.gms.internal.ads.zzbrf
            r2.<init>(r0)
            goto L213
        L226:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpr r12 = com.google.android.gms.internal.ads.zzbpq.zzb(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            r0 = r14
            r1 = r3
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r11
            r6 = r12
            r0.zzp(r1, r2, r3, r4, r5, r6)
            r17.writeNoException()
            goto L38d
        L240:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            boolean r0 = r14.zzs(r0)
            r17.writeNoException()
            r9.writeInt(r0)
            goto L38d
        L257:
            java.lang.String r3 = r16.readString()
            java.lang.String r4 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r0 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r1, r0)
            r5 = r0
            com.google.android.gms.ads.internal.client.zzm r5 = (com.google.android.gms.ads.internal.client.zzm) r5
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L278
        L276:
            r7 = r2
            goto L28b
        L278:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzbrb
            if (r7 == 0) goto L285
            com.google.android.gms.internal.ads.zzbrb r2 = (com.google.android.gms.internal.ads.zzbrb) r2
            goto L276
        L285:
            com.google.android.gms.internal.ads.zzbqz r2 = new com.google.android.gms.internal.ads.zzbqz
            r2.<init>(r0)
            goto L276
        L28b:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpr r11 = com.google.android.gms.internal.ads.zzbpq.zzb(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            r0 = r14
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.zzl(r1, r2, r3, r4, r5, r6)
            r17.writeNoException()
            goto L38d
        L2a5:
            java.lang.String r3 = r16.readString()
            java.lang.String r4 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r0 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r1, r0)
            r6 = r0
            com.google.android.gms.ads.internal.client.zzm r6 = (com.google.android.gms.ads.internal.client.zzm) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L2c6
        L2c4:
            r5 = r2
            goto L2d7
        L2c6:
            android.os.IInterface r2 = r0.queryLocalInterface(r5)
            boolean r5 = r2 instanceof com.google.android.gms.internal.ads.zzbqy
            if (r5 == 0) goto L2d1
            com.google.android.gms.internal.ads.zzbqy r2 = (com.google.android.gms.internal.ads.zzbqy) r2
            goto L2c4
        L2d1:
            com.google.android.gms.internal.ads.zzbqw r2 = new com.google.android.gms.internal.ads.zzbqw
            r2.<init>(r0)
            goto L2c4
        L2d7:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpr r11 = com.google.android.gms.internal.ads.zzbpq.zzb(r0)
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzs> r0 = com.google.android.gms.ads.internal.client.zzs.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r1, r0)
            r12 = r0
            com.google.android.gms.ads.internal.client.zzs r12 = (com.google.android.gms.ads.internal.client.zzs) r12
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            r0 = r14
            r1 = r3
            r2 = r4
            r3 = r6
            r4 = r7
            r6 = r11
            r7 = r12
            r0.zzj(r1, r2, r3, r4, r5, r6, r7)
            r17.writeNoException()
            goto L38d
        L2fa:
            r16.createStringArray()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object[] r0 = r1.createTypedArray(r0)
            android.os.Bundle[] r0 = (android.os.Bundle[]) r0
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            r17.writeNoException()
            goto L38d
        L30d:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            r17.writeNoException()
            goto L38d
        L31c:
            com.google.android.gms.ads.internal.client.zzeb r0 = r14.zze()
            r17.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r0)
            goto L38d
        L328:
            com.google.android.gms.internal.ads.zzbrz r0 = r14.zzg()
            r17.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r9, r0)
            goto L38d
        L333:
            com.google.android.gms.internal.ads.zzbrz r0 = r14.zzf()
            r17.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r9, r0)
            goto L38d
        L33e:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            java.lang.String r4 = r16.readString()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.ads.zzayn.zza(r1, r0)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r1, r0)
            r6 = r0
            android.os.Bundle r6 = (android.os.Bundle) r6
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzs> r0 = com.google.android.gms.ads.internal.client.zzs.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r1, r0)
            r7 = r0
            com.google.android.gms.ads.internal.client.zzs r7 = (com.google.android.gms.ads.internal.client.zzs) r7
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L36a
        L368:
            r11 = r2
            goto L37d
        L36a:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r11 = r2 instanceof com.google.android.gms.internal.ads.zzbrn
            if (r11 == 0) goto L377
            com.google.android.gms.internal.ads.zzbrn r2 = (com.google.android.gms.internal.ads.zzbrn) r2
            goto L368
        L377:
            com.google.android.gms.internal.ads.zzbrl r2 = new com.google.android.gms.internal.ads.zzbrl
            r2.<init>(r0)
            goto L368
        L37d:
            com.google.android.gms.internal.ads.zzayn.zzc(r16)
            r0 = r14
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.zzh(r1, r2, r3, r4, r5, r6)
            r17.writeNoException()
        L38d:
            return r10
    }
}
