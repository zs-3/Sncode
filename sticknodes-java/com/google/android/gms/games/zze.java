package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zze extends com.google.android.gms.games.zzf {
    zze() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.zzf, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.google.android.gms.games.GameEntity r1 = r0.zza(r1)
            return r1
    }

    @Override // com.google.android.gms.games.zzf
    public final com.google.android.gms.games.GameEntity zza(android.os.Parcel r29) {
            r28 = this;
            java.lang.Integer r0 = com.google.android.gms.games.GameEntity.zzi()
            boolean r0 = com.google.android.gms.games.GameEntity.zzk(r0)
            if (r0 != 0) goto L99
            java.lang.Class<com.google.android.gms.games.GameEntity> r0 = com.google.android.gms.games.GameEntity.class
            java.lang.String r0 = r0.getCanonicalName()
            boolean r0 = com.google.android.gms.games.GameEntity.zzl(r0)
            if (r0 == 0) goto L18
            goto L99
        L18:
            java.lang.String r2 = r29.readString()
            java.lang.String r3 = r29.readString()
            java.lang.String r4 = r29.readString()
            java.lang.String r5 = r29.readString()
            java.lang.String r6 = r29.readString()
            java.lang.String r7 = r29.readString()
            java.lang.String r0 = r29.readString()
            r1 = 0
            if (r0 != 0) goto L39
            r8 = r1
            goto L3e
        L39:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r8 = r0
        L3e:
            java.lang.String r0 = r29.readString()
            if (r0 != 0) goto L46
            r9 = r1
            goto L4b
        L46:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r9 = r0
        L4b:
            java.lang.String r0 = r29.readString()
            if (r0 != 0) goto L53
            r10 = r1
            goto L58
        L53:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r10 = r0
        L58:
            int r0 = r29.readInt()
            r1 = 1
            r11 = 0
            if (r0 <= 0) goto L62
            r0 = 1
            goto L63
        L62:
            r0 = 0
        L63:
            int r12 = r29.readInt()
            if (r12 <= 0) goto L6b
            r12 = 1
            goto L6c
        L6b:
            r12 = 0
        L6c:
            java.lang.String r13 = r29.readString()
            int r14 = r29.readInt()
            int r15 = r29.readInt()
            int r16 = r29.readInt()
            com.google.android.gms.games.GameEntity r27 = new com.google.android.gms.games.GameEntity
            r1 = r27
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r11 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r27
        L99:
            com.google.android.gms.games.GameEntity r0 = super.zza(r29)
            return r0
    }
}
