package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzafv {
    private static final java.lang.String[] zza = null;
    private static final java.lang.String[] zzb = null;
    private static final java.lang.String[] zzc = null;

    static {
            java.lang.String r0 = "Camera:MotionPhoto"
            java.lang.String r1 = "GCamera:MotionPhoto"
            java.lang.String r2 = "Camera:MicroVideo"
            java.lang.String r3 = "GCamera:MicroVideo"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            com.google.android.gms.internal.ads.zzafv.zza = r0
            java.lang.String r0 = "Camera:MotionPhotoPresentationTimestampUs"
            java.lang.String r1 = "GCamera:MotionPhotoPresentationTimestampUs"
            java.lang.String r2 = "Camera:MicroVideoPresentationTimestampUs"
            java.lang.String r3 = "GCamera:MicroVideoPresentationTimestampUs"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            com.google.android.gms.internal.ads.zzafv.zzb = r0
            java.lang.String r0 = "Camera:MicroVideoOffset"
            java.lang.String r1 = "GCamera:MicroVideoOffset"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.gms.internal.ads.zzafv.zzc = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzafr zza(java.lang.String r22) throws java.io.IOException {
            java.lang.String r0 = "x:xmpmeta"
            r1 = 0
            org.xmlpull.v1.XmlPullParserFactory r2 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch: java.lang.Throwable -> Le0
            org.xmlpull.v1.XmlPullParser r2 = r2.newPullParser()     // Catch: java.lang.Throwable -> Le0
            java.io.StringReader r3 = new java.io.StringReader     // Catch: java.lang.Throwable -> Le0
            r4 = r22
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Le0
            r2.setInput(r3)     // Catch: java.lang.Throwable -> Le0
            r2.next()     // Catch: java.lang.Throwable -> Le0
            boolean r3 = com.google.android.gms.internal.ads.zzev.zzc(r2, r0)     // Catch: java.lang.Throwable -> Le0
            if (r3 == 0) goto Ld9
            com.google.android.gms.internal.ads.zzgax r3 = com.google.android.gms.internal.ads.zzgax.zzn()     // Catch: java.lang.Throwable -> Le0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r2.next()     // Catch: java.lang.Throwable -> Le0
            java.lang.String r8 = "rdf:Description"
            boolean r8 = com.google.android.gms.internal.ads.zzev.zzc(r2, r8)     // Catch: java.lang.Throwable -> Le0
            if (r8 != 0) goto L57
            java.lang.String r8 = "Container:Directory"
            boolean r8 = com.google.android.gms.internal.ads.zzev.zzc(r2, r8)     // Catch: java.lang.Throwable -> Le0
            if (r8 == 0) goto L45
            java.lang.String r3 = "Container"
            java.lang.String r8 = "Item"
            com.google.android.gms.internal.ads.zzgax r3 = zzb(r2, r3, r8)     // Catch: java.lang.Throwable -> Le0
            goto Lc1
        L45:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = com.google.android.gms.internal.ads.zzev.zzc(r2, r8)     // Catch: java.lang.Throwable -> Le0
            if (r8 == 0) goto Lc1
            java.lang.String r3 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            com.google.android.gms.internal.ads.zzgax r3 = zzb(r2, r3, r8)     // Catch: java.lang.Throwable -> Le0
            goto Lc1
        L57:
            java.lang.String[] r3 = com.google.android.gms.internal.ads.zzafv.zza     // Catch: java.lang.Throwable -> Le0
            r6 = 0
            r7 = 0
        L5b:
            r8 = 4
            if (r7 >= r8) goto Ld8
            r9 = r3[r7]     // Catch: java.lang.Throwable -> Le0
            java.lang.String r9 = com.google.android.gms.internal.ads.zzev.zza(r2, r9)     // Catch: java.lang.Throwable -> Le0
            if (r9 == 0) goto Ld5
            int r3 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Throwable -> Le0
            r7 = 1
            if (r3 != r7) goto Ld8
            java.lang.String[] r3 = com.google.android.gms.internal.ads.zzafv.zzb     // Catch: java.lang.Throwable -> Le0
            r7 = 0
        L70:
            if (r7 >= r8) goto L88
            r9 = r3[r7]     // Catch: java.lang.Throwable -> Le0
            java.lang.String r9 = com.google.android.gms.internal.ads.zzev.zza(r2, r9)     // Catch: java.lang.Throwable -> Le0
            if (r9 == 0) goto L85
            long r7 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Throwable -> Le0
            r9 = -1
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L89
            goto L88
        L85:
            int r7 = r7 + 1
            goto L70
        L88:
            r7 = r4
        L89:
            java.lang.String[] r3 = com.google.android.gms.internal.ads.zzafv.zzc     // Catch: java.lang.Throwable -> Le0
        L8b:
            r9 = 2
            if (r6 >= r9) goto Lbc
            r9 = r3[r6]     // Catch: java.lang.Throwable -> Le0
            java.lang.String r9 = com.google.android.gms.internal.ads.zzev.zza(r2, r9)     // Catch: java.lang.Throwable -> Le0
            if (r9 == 0) goto Lb9
            long r13 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Throwable -> Le0
            com.google.android.gms.internal.ads.zzafq r3 = new com.google.android.gms.internal.ads.zzafq     // Catch: java.lang.Throwable -> Le0
            java.lang.String r16 = "image/jpeg"
            java.lang.String r17 = "Primary"
            r18 = 0
            r20 = 0
            r15 = r3
            r15.<init>(r16, r17, r18, r20)     // Catch: java.lang.Throwable -> Le0
            com.google.android.gms.internal.ads.zzafq r6 = new com.google.android.gms.internal.ads.zzafq     // Catch: java.lang.Throwable -> Le0
            java.lang.String r11 = "video/mp4"
            java.lang.String r12 = "MotionPhoto"
            r15 = 0
            r10 = r6
            r10.<init>(r11, r12, r13, r15)     // Catch: java.lang.Throwable -> Le0
            com.google.android.gms.internal.ads.zzgax r3 = com.google.android.gms.internal.ads.zzgax.zzp(r3, r6)     // Catch: java.lang.Throwable -> Le0
            goto Lc0
        Lb9:
            int r6 = r6 + 1
            goto L8b
        Lbc:
            com.google.android.gms.internal.ads.zzgax r3 = com.google.android.gms.internal.ads.zzgax.zzn()     // Catch: java.lang.Throwable -> Le0
        Lc0:
            r6 = r7
        Lc1:
            boolean r8 = com.google.android.gms.internal.ads.zzev.zzb(r2, r0)     // Catch: java.lang.Throwable -> Le0
            if (r8 == 0) goto L28
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> Le0
            if (r0 == 0) goto Lce
            goto Ld8
        Lce:
            com.google.android.gms.internal.ads.zzafr r0 = new com.google.android.gms.internal.ads.zzafr     // Catch: java.lang.Throwable -> Le0
            r0.<init>(r6, r3)     // Catch: java.lang.Throwable -> Le0
            r1 = r0
            goto Ld8
        Ld5:
            int r7 = r7 + 1
            goto L5b
        Ld8:
            return r1
        Ld9:
            java.lang.String r0 = "Couldn't find xmp metadata"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r1)     // Catch: java.lang.Throwable -> Le0
            throw r0     // Catch: java.lang.Throwable -> Le0
        Le0:
            java.lang.String r0 = "MotionPhotoXmpParser"
            java.lang.String r2 = "Ignoring unexpected XMP metadata"
            com.google.android.gms.internal.ads.zzea.zzf(r0, r2)
            return r1
    }

    private static com.google.android.gms.internal.ads.zzgax zzb(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, java.lang.String r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            com.google.android.gms.internal.ads.zzgau r0 = new com.google.android.gms.internal.ads.zzgau
            r0.<init>()
        L5:
            java.lang.String r1 = ":Item"
            java.lang.String r1 = r13.concat(r1)
            r12.next()
            boolean r1 = com.google.android.gms.internal.ads.zzev.zzc(r12, r1)
            if (r1 == 0) goto L63
            java.lang.String r1 = ":Mime"
            java.lang.String r1 = r14.concat(r1)
            java.lang.String r2 = ":Semantic"
            java.lang.String r2 = r14.concat(r2)
            java.lang.String r3 = ":Length"
            java.lang.String r3 = r14.concat(r3)
            java.lang.String r4 = ":Padding"
            java.lang.String r4 = r14.concat(r4)
            java.lang.String r6 = com.google.android.gms.internal.ads.zzev.zza(r12, r1)
            java.lang.String r7 = com.google.android.gms.internal.ads.zzev.zza(r12, r2)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzev.zza(r12, r3)
            java.lang.String r2 = com.google.android.gms.internal.ads.zzev.zza(r12, r4)
            if (r6 == 0) goto L5e
            if (r7 != 0) goto L41
            goto L5e
        L41:
            com.google.android.gms.internal.ads.zzafq r3 = new com.google.android.gms.internal.ads.zzafq
            r4 = 0
            if (r1 == 0) goto L4c
            long r8 = java.lang.Long.parseLong(r1)
            goto L4d
        L4c:
            r8 = r4
        L4d:
            if (r2 == 0) goto L55
            long r1 = java.lang.Long.parseLong(r2)
            r10 = r1
            goto L56
        L55:
            r10 = r4
        L56:
            r5 = r3
            r5.<init>(r6, r7, r8, r10)
            r0.zzf(r3)
            goto L63
        L5e:
            com.google.android.gms.internal.ads.zzgax r12 = com.google.android.gms.internal.ads.zzgax.zzn()
            return r12
        L63:
            java.lang.String r1 = ":Directory"
            java.lang.String r1 = r13.concat(r1)
            boolean r1 = com.google.android.gms.internal.ads.zzev.zzb(r12, r1)
            if (r1 == 0) goto L5
            com.google.android.gms.internal.ads.zzgax r12 = r0.zzi()
            return r12
    }
}
