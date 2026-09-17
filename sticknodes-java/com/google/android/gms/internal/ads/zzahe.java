package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzahe extends com.google.android.gms.internal.ads.zzagv {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzahe> CREATOR = null;
    public final java.lang.String zza;
    public final com.google.android.gms.internal.ads.zzgax zzb;

    static {
            com.google.android.gms.internal.ads.zzahd r0 = new com.google.android.gms.internal.ads.zzahd
            r0.<init>()
            com.google.android.gms.internal.ads.zzahe.CREATOR = r0
            return
    }

    public zzahe(java.lang.String r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r3.isEmpty()
            r1 = r1 ^ 1
            com.google.android.gms.internal.ads.zzdi.zzd(r1)
            r0.zza = r2
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzl(r3)
            r0.zzb = r1
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            return
    }

    private static java.util.List zzb(java.lang.String r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.length()     // Catch: java.lang.NumberFormatException -> L7c
            r2 = 5
            r3 = 10
            r4 = 7
            r5 = 0
            r6 = 4
            if (r1 < r3) goto L41
            java.lang.String r1 = r7.substring(r5, r6)     // Catch: java.lang.NumberFormatException -> L7c
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L7c
            r0.add(r1)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.String r1 = r7.substring(r2, r4)     // Catch: java.lang.NumberFormatException -> L7c
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L7c
            r0.add(r1)     // Catch: java.lang.NumberFormatException -> L7c
            r1 = 8
            java.lang.String r7 = r7.substring(r1, r3)     // Catch: java.lang.NumberFormatException -> L7c
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L7c
            r0.add(r7)     // Catch: java.lang.NumberFormatException -> L7c
            goto L7b
        L41:
            int r1 = r7.length()     // Catch: java.lang.NumberFormatException -> L7c
            if (r1 < r4) goto L66
            java.lang.String r1 = r7.substring(r5, r6)     // Catch: java.lang.NumberFormatException -> L7c
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L7c
            r0.add(r1)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.String r7 = r7.substring(r2, r4)     // Catch: java.lang.NumberFormatException -> L7c
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L7c
            r0.add(r7)     // Catch: java.lang.NumberFormatException -> L7c
            goto L7b
        L66:
            int r1 = r7.length()     // Catch: java.lang.NumberFormatException -> L7c
            if (r1 < r6) goto L7b
            java.lang.String r7 = r7.substring(r5, r6)     // Catch: java.lang.NumberFormatException -> L7c
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L7c
            r0.add(r7)     // Catch: java.lang.NumberFormatException -> L7c
        L7b:
            return r0
        L7c:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            return r7
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L31
            java.lang.Class<com.google.android.gms.internal.ads.zzahe> r2 = com.google.android.gms.internal.ads.zzahe.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L31
        L10:
            com.google.android.gms.internal.ads.zzahe r5 = (com.google.android.gms.internal.ads.zzahe) r5
            java.lang.String r2 = r4.zzf
            java.lang.String r3 = r5.zzf
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L31
            com.google.android.gms.internal.ads.zzgax r2 = r4.zzb
            com.google.android.gms.internal.ads.zzgax r5 = r5.zzb
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L31
            return r0
        L31:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zzf
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            java.lang.String r1 = r3.zza
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 * 31
            com.google.android.gms.internal.ads.zzgax r2 = r3.zzb
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzagv
    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r3.zzb
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.zzf
            r1.append(r2)
            java.lang.String r2 = ": description="
            r1.append(r2)
            java.lang.String r2 = r3.zza
            r1.append(r2)
            java.lang.String r2 = ": values="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r3 = r1.zzf
            r2.writeString(r3)
            java.lang.String r3 = r1.zza
            r2.writeString(r3)
            com.google.android.gms.internal.ads.zzgax r3 = r1.zzb
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.writeStringArray(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzagv, com.google.android.gms.internal.ads.zzbj
    public final void zza(com.google.android.gms.internal.ads.zzbf r10) {
            r9 = this;
            java.lang.String r0 = r9.zzf
            int r1 = r0.hashCode()
            r2 = 10
            r3 = 4
            r4 = -1
            r5 = 3
            r6 = 1
            r7 = 2
            r8 = 0
            switch(r1) {
                case 82815: goto L10b;
                case 82878: goto L100;
                case 82897: goto Lf5;
                case 83253: goto Leb;
                case 83254: goto Le1;
                case 83255: goto Ld6;
                case 83341: goto Lcb;
                case 83378: goto Lc1;
                case 83536: goto Lb6;
                case 83552: goto Lab;
                case 2567331: goto La0;
                case 2569357: goto L94;
                case 2569358: goto L88;
                case 2569891: goto L7c;
                case 2570401: goto L70;
                case 2570410: goto L64;
                case 2571565: goto L58;
                case 2575251: goto L4d;
                case 2581512: goto L42;
                case 2581513: goto L37;
                case 2581514: goto L2b;
                case 2583398: goto L1f;
                case 2590194: goto L13;
                default: goto L11;
            }
        L11:
            goto L115
        L13:
            java.lang.String r1 = "TYER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 11
            goto L116
        L1f:
            java.lang.String r1 = "TRCK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 9
            goto L116
        L2b:
            java.lang.String r1 = "TPE3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 19
            goto L116
        L37:
            java.lang.String r1 = "TPE2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 5
            goto L116
        L42:
            java.lang.String r1 = "TPE1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 3
            goto L116
        L4d:
            java.lang.String r1 = "TIT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 1
            goto L116
        L58:
            java.lang.String r1 = "TEXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 21
            goto L116
        L64:
            java.lang.String r1 = "TDRL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 15
            goto L116
        L70:
            java.lang.String r1 = "TDRC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 14
            goto L116
        L7c:
            java.lang.String r1 = "TDAT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 13
            goto L116
        L88:
            java.lang.String r1 = "TCON"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 22
            goto L116
        L94:
            java.lang.String r1 = "TCOM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 17
            goto L116
        La0:
            java.lang.String r1 = "TALB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 7
            goto L116
        Lab:
            java.lang.String r1 = "TYE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 10
            goto L116
        Lb6:
            java.lang.String r1 = "TXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 20
            goto L116
        Lc1:
            java.lang.String r1 = "TT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 0
            goto L116
        Lcb:
            java.lang.String r1 = "TRK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 8
            goto L116
        Ld6:
            java.lang.String r1 = "TP3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 18
            goto L116
        Le1:
            java.lang.String r1 = "TP2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 4
            goto L116
        Leb:
            java.lang.String r1 = "TP1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 2
            goto L116
        Lf5:
            java.lang.String r1 = "TDA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 12
            goto L116
        L100:
            java.lang.String r1 = "TCM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 16
            goto L116
        L10b:
            java.lang.String r1 = "TAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L115
            r0 = 6
            goto L116
        L115:
            r0 = -1
        L116:
            switch(r0) {
                case 0: goto L25e;
                case 1: goto L25e;
                case 2: goto L252;
                case 3: goto L252;
                case 4: goto L246;
                case 5: goto L246;
                case 6: goto L23a;
                case 7: goto L23a;
                case 8: goto L20a;
                case 9: goto L20a;
                case 10: goto L1f6;
                case 11: goto L1f6;
                case 12: goto L1cf;
                case 13: goto L1cf;
                case 14: goto L19b;
                case 15: goto L167;
                case 16: goto L15b;
                case 17: goto L15b;
                case 18: goto L14f;
                case 19: goto L14f;
                case 20: goto L143;
                case 21: goto L143;
                case 22: goto L11b;
                default: goto L119;
            }
        L119:
            goto L269
        L11b:
            com.google.android.gms.internal.ads.zzgax r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Integer r0 = com.google.android.gms.internal.ads.zzgdu.zzf(r0, r2)
            if (r0 != 0) goto L135
            com.google.android.gms.internal.ads.zzgax r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zzi(r0)
            return
        L135:
            int r0 = r0.intValue()
            java.lang.String r0 = com.google.android.gms.internal.ads.zzagw.zza(r0)
            if (r0 == 0) goto L269
            r10.zzi(r0)
            return
        L143:
            com.google.android.gms.internal.ads.zzgax r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zzt(r0)
            return
        L14f:
            com.google.android.gms.internal.ads.zzgax r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zzg(r0)
            return
        L15b:
            com.google.android.gms.internal.ads.zzgax r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zzf(r0)
            return
        L167:
            com.google.android.gms.internal.ads.zzgax r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = zzb(r0)
            int r1 = r0.size()
            if (r1 == r6) goto L191
            if (r1 == r7) goto L188
            if (r1 == r5) goto L17f
            goto L269
        L17f:
            java.lang.Object r1 = r0.get(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r10.zzm(r1)
        L188:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r10.zzn(r1)
        L191:
            java.lang.Object r0 = r0.get(r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.zzo(r0)
            return
        L19b:
            com.google.android.gms.internal.ads.zzgax r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = zzb(r0)
            int r1 = r0.size()
            if (r1 == r6) goto L1c5
            if (r1 == r7) goto L1bc
            if (r1 == r5) goto L1b3
            goto L269
        L1b3:
            java.lang.Object r1 = r0.get(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r10.zzj(r1)
        L1bc:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r10.zzk(r1)
        L1c5:
            java.lang.Object r0 = r0.get(r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.zzl(r0)
            return
        L1cf:
            com.google.android.gms.internal.ads.zzgax r0 = r9.zzb     // Catch: java.lang.Throwable -> L1f5
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L1f5
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1f5
            java.lang.String r1 = r0.substring(r7, r3)     // Catch: java.lang.Throwable -> L1f5
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L1f5
            java.lang.String r0 = r0.substring(r8, r7)     // Catch: java.lang.Throwable -> L1f5
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L1f5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1f5
            r10.zzk(r1)     // Catch: java.lang.Throwable -> L1f5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1f5
            r10.zzj(r0)     // Catch: java.lang.Throwable -> L1f5
        L1f5:
            return
        L1f6:
            com.google.android.gms.internal.ads.zzgax r0 = r9.zzb     // Catch: java.lang.NumberFormatException -> L209
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.NumberFormatException -> L209
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L209
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L209
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L209
            r10.zzl(r0)     // Catch: java.lang.NumberFormatException -> L209
        L209:
            return
        L20a:
            com.google.android.gms.internal.ads.zzgax r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            java.lang.String r1 = "/"
            java.lang.String[] r0 = r0.split(r1, r4)
            r1 = r0[r8]     // Catch: java.lang.NumberFormatException -> L239
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L239
            int r2 = r0.length     // Catch: java.lang.NumberFormatException -> L239
            if (r2 <= r6) goto L22e
            r0 = r0[r6]     // Catch: java.lang.NumberFormatException -> L239
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L239
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L239
            goto L22f
        L22e:
            r0 = 0
        L22f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L239
            r10.zzs(r1)     // Catch: java.lang.NumberFormatException -> L239
            r10.zzr(r0)     // Catch: java.lang.NumberFormatException -> L239
        L239:
            return
        L23a:
            com.google.android.gms.internal.ads.zzgax r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zzd(r0)
            return
        L246:
            com.google.android.gms.internal.ads.zzgax r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zzc(r0)
            return
        L252:
            com.google.android.gms.internal.ads.zzgax r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zze(r0)
            return
        L25e:
            com.google.android.gms.internal.ads.zzgax r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zzq(r0)
        L269:
            return
    }
}
