package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public abstract class zzca extends com.google.android.gms.internal.games.zzb implements com.google.android.gms.games.internal.zzcb {
    public zzca() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.games.zzb
    protected final boolean zza(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) throws android.os.RemoteException {
            r6 = this;
            r10 = 6001(0x1771, float:8.409E-42)
            if (r7 == r10) goto L55b
            r10 = 6002(0x1772, float:8.41E-42)
            if (r7 == r10) goto L554
            r10 = 12011(0x2eeb, float:1.6831E-41)
            if (r7 == r10) goto L545
            r10 = 12012(0x2eec, float:1.6832E-41)
            if (r7 == r10) goto L536
            r10 = 13001(0x32c9, float:1.8218E-41)
            if (r7 == r10) goto L52a
            r10 = 13002(0x32ca, float:1.822E-41)
            if (r7 == r10) goto L523
            r10 = 19001(0x4a39, float:2.6626E-41)
            if (r7 == r10) goto L510
            r10 = 19002(0x4a3a, float:2.6627E-41)
            if (r7 == r10) goto L501
            switch(r7) {
                case 5001: goto L4f7;
                case 5002: goto L4e8;
                case 5003: goto L4d8;
                case 5004: goto L4c8;
                case 5005: goto L4b2;
                case 5006: goto L4a2;
                case 5007: goto L492;
                case 5008: goto L482;
                case 5009: goto L472;
                case 5010: goto L465;
                case 5011: goto L458;
                default: goto L23;
            }
        L23:
            switch(r7) {
                case 5016: goto L453;
                case 5017: goto L446;
                case 5018: goto L439;
                case 5019: goto L42c;
                case 5020: goto L421;
                case 5021: goto L414;
                case 5022: goto L407;
                case 5023: goto L3fa;
                case 5024: goto L3ed;
                case 5025: goto L3e0;
                case 5026: goto L3d0;
                case 5027: goto L3c0;
                case 5028: goto L3b0;
                case 5029: goto L3a0;
                case 5030: goto L390;
                case 5031: goto L380;
                case 5032: goto L373;
                case 5033: goto L365;
                case 5034: goto L357;
                case 5035: goto L34a;
                case 5036: goto L342;
                case 5037: goto L335;
                case 5038: goto L328;
                case 5039: goto L31b;
                case 5040: goto L313;
                case 9001: goto L306;
                case 11001: goto L2f6;
                case 12001: goto L2e6;
                case 14001: goto L2d9;
                case 15001: goto L2c9;
                case 17002: goto L2c1;
                case 19008: goto L2b9;
                case 19009: goto L2b1;
                case 19010: goto L2a9;
                case 20001: goto L29c;
                case 20002: goto L28f;
                case 20003: goto L282;
                case 20004: goto L275;
                case 20005: goto L268;
                case 20006: goto L25b;
                case 20007: goto L24e;
                case 20008: goto L241;
                case 20009: goto L234;
                case 20012: goto L227;
                case 20019: goto L21b;
                case 20020: goto L207;
                case 23001: goto L1ff;
                case 23002: goto L1f7;
                case 23003: goto L1ef;
                case 23004: goto L1e7;
                case 23005: goto L1df;
                case 24002: goto L1d7;
                case 25002: goto L1cf;
                case 25003: goto L1bf;
                case 25004: goto L1b2;
                case 25005: goto L1a2;
                default: goto L26;
            }
        L26:
            switch(r7) {
                case 8001: goto L192;
                case 8002: goto L182;
                case 8003: goto L175;
                case 8004: goto L168;
                case 8005: goto L15b;
                case 8006: goto L14e;
                case 8007: goto L143;
                case 8008: goto L136;
                case 8009: goto L12e;
                case 8010: goto L126;
                default: goto L29;
            }
        L29:
            switch(r7) {
                case 10001: goto L119;
                case 10002: goto L111;
                case 10003: goto L104;
                case 10004: goto Lf7;
                case 10005: goto Le7;
                case 10006: goto Lda;
                default: goto L2c;
            }
        L2c:
            switch(r7) {
                case 12004: goto Lc2;
                case 12005: goto Lb2;
                case 12006: goto La5;
                case 12007: goto L98;
                case 12008: goto L8b;
                default: goto L2f;
            }
        L2f:
            switch(r7) {
                case 12014: goto L7e;
                case 12015: goto L6e;
                case 12016: goto L61;
                case 12017: goto L34;
                default: goto L32;
            }
        L32:
            r7 = 0
            return r7
        L34:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            r1 = r7
            com.google.android.gms.common.data.DataHolder r1 = (com.google.android.gms.common.data.DataHolder) r1
            java.lang.String r2 = r8.readString()
            android.os.Parcelable$Creator<com.google.android.gms.drive.Contents> r7 = com.google.android.gms.drive.Contents.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            r3 = r10
            com.google.android.gms.drive.Contents r3 = (com.google.android.gms.drive.Contents) r3
            android.os.Parcelable r10 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            r4 = r10
            com.google.android.gms.drive.Contents r4 = (com.google.android.gms.drive.Contents) r4
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            r5 = r7
            com.google.android.gms.drive.Contents r5 = (com.google.android.gms.drive.Contents) r5
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r0 = r6
            r0.zzq(r1, r2, r3, r4, r5)
            goto L561
        L61:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L6e:
            r8.readInt()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            android.os.Bundle r7 = (android.os.Bundle) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L7e:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L8b:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L98:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        La5:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        Lb2:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzp(r7)
            goto L561
        Lc2:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            android.os.Parcelable$Creator<com.google.android.gms.drive.Contents> r10 = com.google.android.gms.drive.Contents.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.games.zzc.zza(r8, r10)
            com.google.android.gms.drive.Contents r10 = (com.google.android.gms.drive.Contents) r10
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzs(r7, r10)
            goto L561
        Lda:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        Le7:
            r8.readInt()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            android.os.Bundle r7 = (android.os.Bundle) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        Lf7:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L104:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L111:
            r8.readString()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L119:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L126:
            r8.readString()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L12e:
            r8.readString()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L136:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L143:
            r8.readInt()
            r8.readString()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L14e:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L15b:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L168:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L175:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L182:
            r8.readInt()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            android.os.Bundle r7 = (android.os.Bundle) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L192:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzk(r7)
            goto L561
        L1a2:
            r8.readInt()
            android.os.Parcelable$Creator<com.google.android.gms.games.internal.player.zze> r7 = com.google.android.gms.games.internal.player.zze.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.games.internal.player.zze r7 = (com.google.android.gms.games.internal.player.zze) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L1b2:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r7 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.api.Status r7 = (com.google.android.gms.common.api.Status) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L1bf:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r7 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.api.Status r7 = (com.google.android.gms.common.api.Status) r7
            r8.readString()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L1cf:
            r8.readString()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L1d7:
            com.google.android.gms.internal.games.zzc.zzg(r8)
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L1df:
            r8.readInt()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L1e7:
            r8.readInt()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L1ef:
            r8.readInt()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L1f7:
            r8.readInt()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L1ff:
            r8.readInt()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L207:
            int r7 = r8.readInt()
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.games.zzc.zza(r8, r10)
            android.os.Bundle r10 = (android.os.Bundle) r10
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zze(r7, r10)
            goto L561
        L21b:
            int r7 = r8.readInt()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzd(r7)
            goto L561
        L227:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r7 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.api.Status r7 = (com.google.android.gms.common.api.Status) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L234:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L241:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L24e:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L25b:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L268:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L275:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L282:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L28f:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L29c:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L2a9:
            r8.readInt()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L2b1:
            r8.readInt()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L2b9:
            r8.readInt()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L2c1:
            r8.readInt()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L2c9:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzl(r7)
            goto L561
        L2d9:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            java.lang.Object[] r7 = r8.createTypedArray(r7)
            com.google.android.gms.common.data.DataHolder[] r7 = (com.google.android.gms.common.data.DataHolder[]) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L2e6:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzt(r7)
            goto L561
        L2f6:
            r8.readInt()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            android.os.Bundle r7 = (android.os.Bundle) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L306:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L313:
            r8.readInt()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L31b:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L328:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L335:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L342:
            r8.readInt()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L34a:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L357:
            r8.readInt()
            r8.readString()
            com.google.android.gms.internal.games.zzc.zzg(r8)
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L365:
            r8.readInt()
            r8.readInt()
            r8.readString()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L373:
            android.os.Parcelable$Creator<com.google.android.gms.games.multiplayer.realtime.zzb> r7 = com.google.android.gms.games.multiplayer.realtime.zzb.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.games.multiplayer.realtime.zzb r7 = (com.google.android.gms.games.multiplayer.realtime.zzb) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L380:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            r8.createStringArray()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L390:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            r8.createStringArray()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L3a0:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            r8.createStringArray()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L3b0:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            r8.createStringArray()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L3c0:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            r8.createStringArray()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L3d0:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            r8.createStringArray()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L3e0:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L3ed:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L3fa:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L407:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L414:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L421:
            r8.readInt()
            r8.readString()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L42c:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L439:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L446:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L453:
            r6.zzo()
            goto L561
        L458:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L465:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L472:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzh(r7)
            goto L561
        L482:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzg(r7)
            goto L561
        L492:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzm(r7)
            goto L561
        L4a2:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzn(r7)
            goto L561
        L4b2:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r10 = (com.google.android.gms.common.data.DataHolder) r10
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzi(r10, r7)
            goto L561
        L4c8:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzj(r7)
            goto L561
        L4d8:
            int r7 = r8.readInt()
            java.lang.String r10 = r8.readString()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzb(r7, r10)
            goto L561
        L4e8:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzc(r7)
            goto L561
        L4f7:
            r8.readInt()
            r8.readString()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L501:
            int r7 = r8.readInt()
            boolean r10 = com.google.android.gms.internal.games.zzc.zzg(r8)
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzu(r7, r10)
            goto L561
        L510:
            int r7 = r8.readInt()
            android.os.Parcelable$Creator<com.google.android.gms.games.video.VideoCapabilities> r10 = com.google.android.gms.games.video.VideoCapabilities.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.games.zzc.zza(r8, r10)
            com.google.android.gms.games.video.VideoCapabilities r10 = (com.google.android.gms.games.video.VideoCapabilities) r10
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzv(r7, r10)
            goto L561
        L523:
            r8.readInt()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L52a:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L536:
            int r7 = r8.readInt()
            java.lang.String r10 = r8.readString()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzr(r7, r10)
            goto L561
        L545:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r7 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.games.zzc.zza(r8, r7)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            com.google.android.gms.internal.games.zzc.zzb(r8)
            r6.zzf(r7)
            goto L561
        L554:
            r8.readString()
            com.google.android.gms.internal.games.zzc.zzb(r8)
            goto L561
        L55b:
            r8.readString()
            com.google.android.gms.internal.games.zzc.zzb(r8)
        L561:
            r9.writeNoException()
            r7 = 1
            return r7
    }
}
