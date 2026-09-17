package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgho {
    private final com.google.android.gms.internal.ads.zzgwn zza;
    private final java.util.List zzb;
    private final com.google.android.gms.internal.ads.zzgot zzc;

    private zzgho(com.google.android.gms.internal.ads.zzgwn r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            com.google.android.gms.internal.ads.zzgot r1 = com.google.android.gms.internal.ads.zzgot.zza
            r0.zzc = r1
            return
    }

    /* synthetic */ zzgho(com.google.android.gms.internal.ads.zzgwn r1, java.util.List r2, com.google.android.gms.internal.ads.zzgot r3, com.google.android.gms.internal.ads.zzghn r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    static final com.google.android.gms.internal.ads.zzgho zza(com.google.android.gms.internal.ads.zzgwn r2) throws java.security.GeneralSecurityException {
            zzh(r2)
            java.util.List r0 = zzg(r2)
            com.google.android.gms.internal.ads.zzgho r1 = new com.google.android.gms.internal.ads.zzgho
            r1.<init>(r2, r0)
            return r1
    }

    public static final com.google.android.gms.internal.ads.zzgho zzb(com.google.android.gms.internal.ads.zzghs r3) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzghk r0 = new com.google.android.gms.internal.ads.zzghk
            r0.<init>()
            com.google.android.gms.internal.ads.zzghi r1 = new com.google.android.gms.internal.ads.zzghi
            r2 = 0
            r1.<init>(r3, r2)
            r1.zzd()
            r1.zzc()
            r0.zza(r1)
            com.google.android.gms.internal.ads.zzgho r3 = r0.zzb()
            return r3
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzgwn r0) {
            zzh(r0)
            return
    }

    private final java.lang.Object zzf(com.google.android.gms.internal.ads.zzgod r11, java.lang.Class r12, java.lang.Class r13) throws java.security.GeneralSecurityException {
            r10 = this;
            int r0 = com.google.android.gms.internal.ads.zzghz.zza
            com.google.android.gms.internal.ads.zzgwn r0 = r10.zza
            int r1 = r0.zzc()
            java.util.List r0 = r0.zzh()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 1
        L15:
            boolean r7 = r0.hasNext()
            r8 = 3
            if (r7 == 0) goto Laa
            java.lang.Object r7 = r0.next()
            com.google.android.gms.internal.ads.zzgwm r7 = (com.google.android.gms.internal.ads.zzgwm) r7
            int r9 = r7.zzk()
            if (r9 != r8) goto L15
            boolean r8 = r7.zzj()
            if (r8 == 0) goto L92
            com.google.android.gms.internal.ads.zzgxf r8 = r7.zzf()
            com.google.android.gms.internal.ads.zzgxf r9 = com.google.android.gms.internal.ads.zzgxf.zza
            if (r8 == r9) goto L7a
            int r8 = r7.zzk()
            r9 = 2
            if (r8 == r9) goto L62
            int r8 = r7.zza()
            if (r8 != r1) goto L4f
            if (r5 != 0) goto L47
            r5 = 1
            goto L4f
        L47:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "keyset contains multiple primary keys"
            r11.<init>(r12)
            throw r11
        L4f:
            com.google.android.gms.internal.ads.zzgwb r7 = r7.zzc()
            com.google.android.gms.internal.ads.zzgwa r7 = r7.zzc()
            com.google.android.gms.internal.ads.zzgwa r8 = com.google.android.gms.internal.ads.zzgwa.zzd
            if (r7 == r8) goto L5d
            r7 = 0
            goto L5e
        L5d:
            r7 = 1
        L5e:
            r6 = r6 & r7
            int r4 = r4 + 1
            goto L15
        L62:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.Object[] r12 = new java.lang.Object[r3]
            int r13 = r7.zza()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r2] = r13
            java.lang.String r13 = "key %d has unknown status"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            r11.<init>(r12)
            throw r11
        L7a:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.Object[] r12 = new java.lang.Object[r3]
            int r13 = r7.zza()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r2] = r13
            java.lang.String r13 = "key %d has unknown prefix"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            r11.<init>(r12)
            throw r11
        L92:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.Object[] r12 = new java.lang.Object[r3]
            int r13 = r7.zza()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r2] = r13
            java.lang.String r13 = "key %d has no key data"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            r11.<init>(r12)
            throw r11
        Laa:
            if (r4 == 0) goto L166
            if (r5 != 0) goto Lb9
            if (r6 == 0) goto Lb1
            goto Lb9
        Lb1:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "keyset doesn't contain a valid primary key"
            r11.<init>(r12)
            throw r11
        Lb9:
            com.google.android.gms.internal.ads.zzgql r0 = com.google.android.gms.internal.ads.zzgqp.zzb(r13)
            com.google.android.gms.internal.ads.zzgot r1 = r10.zzc
            r0.zzc(r1)
        Lc2:
            java.util.List r1 = r10.zzb
            int r1 = r1.size()
            if (r2 >= r1) goto L15d
            com.google.android.gms.internal.ads.zzgwn r1 = r10.zza
            com.google.android.gms.internal.ads.zzgwm r1 = r1.zze(r2)
            int r3 = r1.zzk()
            if (r3 != r8) goto L159
            java.util.List r3 = r10.zzb
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzghm r3 = (com.google.android.gms.internal.ads.zzghm) r3
            if (r3 == 0) goto L12d
            com.google.android.gms.internal.ads.zzghd r3 = r3.zza()
            java.lang.Object r4 = r11.zzb(r3, r13)     // Catch: java.security.GeneralSecurityException -> Lfc
            int r5 = r1.zza()
            com.google.android.gms.internal.ads.zzgwn r6 = r10.zza
            int r6 = r6.zzc()
            if (r5 != r6) goto Lf8
            r0.zzb(r4, r3, r1)
            goto L159
        Lf8:
            r0.zza(r4, r3, r1)
            goto L159
        Lfc:
            r11 = move-exception
            java.security.GeneralSecurityException r12 = new java.security.GeneralSecurityException
            java.lang.String r13 = r13.toString()
            com.google.android.gms.internal.ads.zzgwb r0 = r1.zzc()
            java.lang.String r0 = r0.zzg()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to get primitive "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = " for key of type "
            r1.append(r13)
            r1.append(r0)
            java.lang.String r13 = ", see https://developers.google.com/tink/faq/registration_errors"
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r12.<init>(r13, r11)
            throw r12
        L12d:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            com.google.android.gms.internal.ads.zzgwb r12 = r1.zzc()
            java.lang.String r12 = r12.zzg()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Key parsing of key with index "
            r13.append(r0)
            r13.append(r2)
            java.lang.String r0 = " and type_url "
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = " failed, unable to get primitive"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L159:
            int r2 = r2 + 1
            goto Lc2
        L15d:
            com.google.android.gms.internal.ads.zzgqp r13 = r0.zzd()
            java.lang.Object r11 = r11.zzc(r13, r12)
            return r11
        L166:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "keyset must contain at least one ENABLED key"
            r11.<init>(r12)
            throw r11
    }

    private static java.util.List zzg(com.google.android.gms.internal.ads.zzgwn r11) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.zza()
            r0.<init>(r1)
            java.util.List r1 = r11.zzh()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La8
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.zzgwm r2 = (com.google.android.gms.internal.ads.zzgwm) r2
            int r6 = r2.zza()
            r9 = 0
            int r3 = r2.zza()     // Catch: java.security.GeneralSecurityException -> La3
            com.google.android.gms.internal.ads.zzgxf r4 = r2.zzf()     // Catch: java.security.GeneralSecurityException -> La3
            com.google.android.gms.internal.ads.zzgxf r5 = com.google.android.gms.internal.ads.zzgxf.zzd     // Catch: java.security.GeneralSecurityException -> La3
            if (r4 != r5) goto L30
            r3 = r9
            goto L34
        L30:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.security.GeneralSecurityException -> La3
        L34:
            com.google.android.gms.internal.ads.zzgwb r4 = r2.zzc()     // Catch: java.security.GeneralSecurityException -> La3
            java.lang.String r4 = r4.zzg()     // Catch: java.security.GeneralSecurityException -> La3
            com.google.android.gms.internal.ads.zzgwb r5 = r2.zzc()     // Catch: java.security.GeneralSecurityException -> La3
            com.google.android.gms.internal.ads.zzgzs r5 = r5.zzf()     // Catch: java.security.GeneralSecurityException -> La3
            com.google.android.gms.internal.ads.zzgwb r7 = r2.zzc()     // Catch: java.security.GeneralSecurityException -> La3
            com.google.android.gms.internal.ads.zzgwa r7 = r7.zzc()     // Catch: java.security.GeneralSecurityException -> La3
            com.google.android.gms.internal.ads.zzgxf r8 = r2.zzf()     // Catch: java.security.GeneralSecurityException -> La3
            com.google.android.gms.internal.ads.zzgqr r3 = com.google.android.gms.internal.ads.zzgqr.zza(r4, r5, r7, r8, r3)     // Catch: java.security.GeneralSecurityException -> La3
            com.google.android.gms.internal.ads.zzgpq r4 = com.google.android.gms.internal.ads.zzgpq.zzc()     // Catch: java.security.GeneralSecurityException -> La3
            com.google.android.gms.internal.ads.zzghw r5 = com.google.android.gms.internal.ads.zzghw.zza()     // Catch: java.security.GeneralSecurityException -> La3
            boolean r7 = r4.zzj(r3)     // Catch: java.security.GeneralSecurityException -> La3
            if (r7 != 0) goto L68
            com.google.android.gms.internal.ads.zzgop r4 = new com.google.android.gms.internal.ads.zzgop     // Catch: java.security.GeneralSecurityException -> La3
            r4.<init>(r3, r5)     // Catch: java.security.GeneralSecurityException -> La3
            goto L6d
        L68:
            com.google.android.gms.internal.ads.zzghd r3 = r4.zza(r3, r5)     // Catch: java.security.GeneralSecurityException -> La3
            r4 = r3
        L6d:
            com.google.android.gms.internal.ads.zzghm r10 = new com.google.android.gms.internal.ads.zzghm     // Catch: java.security.GeneralSecurityException -> La3
            int r2 = r2.zzk()     // Catch: java.security.GeneralSecurityException -> La3
            int r2 = r2 + (-2)
            r3 = 1
            if (r2 == r3) goto L8c
            r5 = 2
            if (r2 == r5) goto L89
            r5 = 3
            if (r2 != r5) goto L81
            com.google.android.gms.internal.ads.zzghf r2 = com.google.android.gms.internal.ads.zzghf.zzc     // Catch: java.security.GeneralSecurityException -> La3
            goto L8e
        L81:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.security.GeneralSecurityException -> La3
            java.lang.String r3 = "Unknown key status"
            r2.<init>(r3)     // Catch: java.security.GeneralSecurityException -> La3
            throw r2     // Catch: java.security.GeneralSecurityException -> La3
        L89:
            com.google.android.gms.internal.ads.zzghf r2 = com.google.android.gms.internal.ads.zzghf.zzb     // Catch: java.security.GeneralSecurityException -> La3
            goto L8e
        L8c:
            com.google.android.gms.internal.ads.zzghf r2 = com.google.android.gms.internal.ads.zzghf.zza     // Catch: java.security.GeneralSecurityException -> La3
        L8e:
            r5 = r2
            int r2 = r11.zzc()     // Catch: java.security.GeneralSecurityException -> La3
            if (r6 != r2) goto L97
            r7 = 1
            goto L99
        L97:
            r2 = 0
            r7 = 0
        L99:
            r8 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.security.GeneralSecurityException -> La3
            r0.add(r10)     // Catch: java.security.GeneralSecurityException -> La3
            goto L11
        La3:
            r0.add(r9)
            goto L11
        La8:
            java.util.List r11 = java.util.Collections.unmodifiableList(r0)
            return r11
    }

    private static void zzh(com.google.android.gms.internal.ads.zzgwn r1) throws java.security.GeneralSecurityException {
            if (r1 == 0) goto L9
            int r1 = r1.zza()
            if (r1 <= 0) goto L9
            return
        L9:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "empty keyset"
            r1.<init>(r0)
            throw r1
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = com.google.android.gms.internal.ads.zzghz.zza
            com.google.android.gms.internal.ads.zzgwp r0 = com.google.android.gms.internal.ads.zzgws.zza()
            com.google.android.gms.internal.ads.zzgwn r1 = r5.zza
            int r2 = r1.zzc()
            r0.zzb(r2)
            java.util.List r1 = r1.zzh()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.zzgwm r2 = (com.google.android.gms.internal.ads.zzgwm) r2
            com.google.android.gms.internal.ads.zzgwq r3 = com.google.android.gms.internal.ads.zzgwr.zza()
            com.google.android.gms.internal.ads.zzgwb r4 = r2.zzc()
            java.lang.String r4 = r4.zzg()
            r3.zzc(r4)
            int r4 = r2.zzk()
            r3.zzd(r4)
            com.google.android.gms.internal.ads.zzgxf r4 = r2.zzf()
            r3.zzb(r4)
            int r2 = r2.zza()
            r3.zza(r2)
            com.google.android.gms.internal.ads.zzhbe r2 = r3.zzbn()
            com.google.android.gms.internal.ads.zzgwr r2 = (com.google.android.gms.internal.ads.zzgwr) r2
            r0.zza(r2)
            goto L17
        L51:
            com.google.android.gms.internal.ads.zzhbe r0 = r0.zzbn()
            com.google.android.gms.internal.ads.zzgws r0 = (com.google.android.gms.internal.ads.zzgws) r0
            java.lang.String r0 = r0.toString()
            return r0
    }

    final com.google.android.gms.internal.ads.zzgwn zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgwn r0 = r1.zza
            return r0
    }

    public final java.lang.Object zzd(com.google.android.gms.internal.ads.zzggx r2, java.lang.Class r3) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.android.gms.internal.ads.zzgod r2 = (com.google.android.gms.internal.ads.zzgod) r2
            java.lang.Class r0 = r2.zza(r3)
            if (r0 == 0) goto Ld
            java.lang.Object r2 = r1.zzf(r2, r3, r0)
            return r2
        Ld:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "No wrapper found for "
            java.lang.String r3 = r0.concat(r3)
            r2.<init>(r3)
            throw r2
    }
}
