package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgk extends com.google.android.gms.internal.measurement.zzbn implements com.google.android.gms.measurement.internal.zzgl {
    public zzgk() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.internal.IMeasurementService"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) throws android.os.RemoteException {
            r8 = this;
            r12 = 0
            r0 = 0
            r1 = 1
            switch(r9) {
                case 1: goto L2ae;
                case 2: goto L294;
                case 3: goto L6;
                case 4: goto L282;
                case 5: goto L268;
                case 6: goto L256;
                case 7: goto L23c;
                case 8: goto L6;
                case 9: goto L221;
                case 10: goto L205;
                case 11: goto L1ee;
                case 12: goto L1d3;
                case 13: goto L1c0;
                case 14: goto L19d;
                case 15: goto L17e;
                case 16: goto L15f;
                case 17: goto L144;
                case 18: goto L131;
                case 19: goto L116;
                case 20: goto L103;
                case 21: goto Le2;
                case 22: goto L6;
                case 23: goto L6;
                case 24: goto Lc3;
                case 25: goto Lb0;
                case 26: goto L9d;
                case 27: goto L8a;
                case 28: goto L6;
                case 29: goto L56;
                case 30: goto L3b;
                case 31: goto L7;
                default: goto L6;
            }
        L6:
            return r0
        L7:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r9 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzr r9 = (com.google.android.gms.measurement.internal.zzr) r9
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.IBinder r2 = r10.readStrongBinder()
            if (r2 != 0) goto L1e
            goto L30
        L1e:
            java.lang.String r12 = "com.google.android.gms.measurement.internal.ITriggerUrisCallback"
            android.os.IInterface r12 = r2.queryLocalInterface(r12)
            boolean r3 = r12 instanceof com.google.android.gms.measurement.internal.zzgo
            if (r3 == 0) goto L2b
            com.google.android.gms.measurement.internal.zzgo r12 = (com.google.android.gms.measurement.internal.zzgo) r12
            goto L30
        L2b:
            com.google.android.gms.measurement.internal.zzgm r12 = new com.google.android.gms.measurement.internal.zzgm
            r12.<init>(r2)
        L30:
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzr(r9, r0, r12)
            r11.writeNoException()
            goto L2c7
        L3b:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r9 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzr r9 = (com.google.android.gms.measurement.internal.zzr) r9
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r12 = com.google.android.gms.measurement.internal.zzag.CREATOR
            android.os.Parcelable r12 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r12)
            com.google.android.gms.measurement.internal.zzag r12 = (com.google.android.gms.measurement.internal.zzag) r12
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzC(r9, r12)
            r11.writeNoException()
            goto L2c7
        L56:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r9 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzr r9 = (com.google.android.gms.measurement.internal.zzr) r9
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzpc> r0 = com.google.android.gms.measurement.internal.zzpc.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r0)
            com.google.android.gms.measurement.internal.zzpc r0 = (com.google.android.gms.measurement.internal.zzpc) r0
            android.os.IBinder r2 = r10.readStrongBinder()
            if (r2 != 0) goto L6d
            goto L7f
        L6d:
            java.lang.String r12 = "com.google.android.gms.measurement.internal.IUploadBatchesCallback"
            android.os.IInterface r12 = r2.queryLocalInterface(r12)
            boolean r3 = r12 instanceof com.google.android.gms.measurement.internal.zzgr
            if (r3 == 0) goto L7a
            com.google.android.gms.measurement.internal.zzgr r12 = (com.google.android.gms.measurement.internal.zzgr) r12
            goto L7f
        L7a:
            com.google.android.gms.measurement.internal.zzgp r12 = new com.google.android.gms.measurement.internal.zzgp
            r12.<init>(r2)
        L7f:
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzo(r9, r0, r12)
            r11.writeNoException()
            goto L2c7
        L8a:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r9 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzr r9 = (com.google.android.gms.measurement.internal.zzr) r9
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzm(r9)
            r11.writeNoException()
            goto L2c7
        L9d:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r9 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzr r9 = (com.google.android.gms.measurement.internal.zzr) r9
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzy(r9)
            r11.writeNoException()
            goto L2c7
        Lb0:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r9 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzr r9 = (com.google.android.gms.measurement.internal.zzr) r9
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzA(r9)
            r11.writeNoException()
            goto L2c7
        Lc3:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r9 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzr r9 = (com.google.android.gms.measurement.internal.zzr) r9
            android.os.Parcelable$Creator r12 = android.os.Bundle.CREATOR
            android.os.Parcelable r12 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r12)
            android.os.Bundle r12 = (android.os.Bundle) r12
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            java.util.List r9 = r8.zzg(r9, r12)
            r11.writeNoException()
            r11.writeTypedList(r9)
            goto L2c7
        Le2:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r9 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzr r9 = (com.google.android.gms.measurement.internal.zzr) r9
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            com.google.android.gms.measurement.internal.zzap r9 = r8.zze(r9)
            r11.writeNoException()
            if (r9 != 0) goto Lfb
            r11.writeInt(r0)
            goto L2c7
        Lfb:
            r11.writeInt(r1)
            r9.writeToParcel(r11, r1)
            goto L2c7
        L103:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r9 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzr r9 = (com.google.android.gms.measurement.internal.zzr) r9
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzv(r9)
            r11.writeNoException()
            goto L2c7
        L116:
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            android.os.Bundle r9 = (android.os.Bundle) r9
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r12 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r12 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r12)
            com.google.android.gms.measurement.internal.zzr r12 = (com.google.android.gms.measurement.internal.zzr) r12
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzx(r9, r12)
            r11.writeNoException()
            goto L2c7
        L131:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r9 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzr r9 = (com.google.android.gms.measurement.internal.zzr) r9
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzs(r9)
            r11.writeNoException()
            goto L2c7
        L144:
            java.lang.String r9 = r10.readString()
            java.lang.String r12 = r10.readString()
            java.lang.String r0 = r10.readString()
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            java.util.List r9 = r8.zzj(r9, r12, r0)
            r11.writeNoException()
            r11.writeTypedList(r9)
            goto L2c7
        L15f:
            java.lang.String r9 = r10.readString()
            java.lang.String r12 = r10.readString()
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r0 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r0)
            com.google.android.gms.measurement.internal.zzr r0 = (com.google.android.gms.measurement.internal.zzr) r0
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            java.util.List r9 = r8.zzi(r9, r12, r0)
            r11.writeNoException()
            r11.writeTypedList(r9)
            goto L2c7
        L17e:
            java.lang.String r9 = r10.readString()
            java.lang.String r12 = r10.readString()
            java.lang.String r0 = r10.readString()
            boolean r2 = com.google.android.gms.internal.measurement.zzbo.zzf(r10)
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            java.util.List r9 = r8.zzl(r9, r12, r0, r2)
            r11.writeNoException()
            r11.writeTypedList(r9)
            goto L2c7
        L19d:
            java.lang.String r9 = r10.readString()
            java.lang.String r12 = r10.readString()
            boolean r0 = com.google.android.gms.internal.measurement.zzbo.zzf(r10)
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r2 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r2)
            com.google.android.gms.measurement.internal.zzr r2 = (com.google.android.gms.measurement.internal.zzr) r2
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            java.util.List r9 = r8.zzk(r9, r12, r0, r2)
            r11.writeNoException()
            r11.writeTypedList(r9)
            goto L2c7
        L1c0:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzai> r9 = com.google.android.gms.measurement.internal.zzai.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzai r9 = (com.google.android.gms.measurement.internal.zzai) r9
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzu(r9)
            r11.writeNoException()
            goto L2c7
        L1d3:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzai> r9 = com.google.android.gms.measurement.internal.zzai.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzai r9 = (com.google.android.gms.measurement.internal.zzai) r9
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r12 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r12 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r12)
            com.google.android.gms.measurement.internal.zzr r12 = (com.google.android.gms.measurement.internal.zzr) r12
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzt(r9, r12)
            r11.writeNoException()
            goto L2c7
        L1ee:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r9 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzr r9 = (com.google.android.gms.measurement.internal.zzr) r9
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            java.lang.String r9 = r8.zzf(r9)
            r11.writeNoException()
            r11.writeString(r9)
            goto L2c7
        L205:
            long r3 = r10.readLong()
            java.lang.String r5 = r10.readString()
            java.lang.String r6 = r10.readString()
            java.lang.String r7 = r10.readString()
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r2 = r8
            r2.zzw(r3, r5, r6, r7)
            r11.writeNoException()
            goto L2c7
        L221:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzbh> r9 = com.google.android.gms.measurement.internal.zzbh.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzbh r9 = (com.google.android.gms.measurement.internal.zzbh) r9
            java.lang.String r12 = r10.readString()
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            byte[] r9 = r8.zzD(r9, r12)
            r11.writeNoException()
            r11.writeByteArray(r9)
            goto L2c7
        L23c:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r9 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzr r9 = (com.google.android.gms.measurement.internal.zzr) r9
            boolean r12 = com.google.android.gms.internal.measurement.zzbo.zzf(r10)
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            java.util.List r9 = r8.zzh(r9, r12)
            r11.writeNoException()
            r11.writeTypedList(r9)
            goto L2c7
        L256:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r9 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzr r9 = (com.google.android.gms.measurement.internal.zzr) r9
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzz(r9)
            r11.writeNoException()
            goto L2c7
        L268:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzbh> r9 = com.google.android.gms.measurement.internal.zzbh.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzbh r9 = (com.google.android.gms.measurement.internal.zzbh) r9
            java.lang.String r12 = r10.readString()
            java.lang.String r0 = r10.readString()
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzq(r9, r12, r0)
            r11.writeNoException()
            goto L2c7
        L282:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r9 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzr r9 = (com.google.android.gms.measurement.internal.zzr) r9
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzn(r9)
            r11.writeNoException()
            goto L2c7
        L294:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzqb> r9 = com.google.android.gms.measurement.internal.zzqb.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzqb r9 = (com.google.android.gms.measurement.internal.zzqb) r9
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r12 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r12 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r12)
            com.google.android.gms.measurement.internal.zzr r12 = (com.google.android.gms.measurement.internal.zzr) r12
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzB(r9, r12)
            r11.writeNoException()
            goto L2c7
        L2ae:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzbh> r9 = com.google.android.gms.measurement.internal.zzbh.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r9)
            com.google.android.gms.measurement.internal.zzbh r9 = (com.google.android.gms.measurement.internal.zzbh) r9
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzr> r12 = com.google.android.gms.measurement.internal.zzr.CREATOR
            android.os.Parcelable r12 = com.google.android.gms.internal.measurement.zzbo.zza(r10, r12)
            com.google.android.gms.measurement.internal.zzr r12 = (com.google.android.gms.measurement.internal.zzr) r12
            com.google.android.gms.internal.measurement.zzbo.zzc(r10)
            r8.zzp(r9, r12)
            r11.writeNoException()
        L2c7:
            return r1
    }
}
