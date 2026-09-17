package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzhs extends com.google.android.gms.internal.auth.zzev implements com.google.android.gms.internal.auth.zzfy {
    private static final com.google.android.gms.internal.auth.zzhs zzb = null;
    private com.google.android.gms.internal.auth.zzez zzd;

    static {
            com.google.android.gms.internal.auth.zzhs r0 = new com.google.android.gms.internal.auth.zzhs
            r0.<init>()
            com.google.android.gms.internal.auth.zzhs.zzb = r0
            java.lang.Class<com.google.android.gms.internal.auth.zzhs> r1 = com.google.android.gms.internal.auth.zzhs.class
            com.google.android.gms.internal.auth.zzev.zzk(r1, r0)
            return
    }

    private zzhs() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.auth.zzez r0 = com.google.android.gms.internal.auth.zzev.zzf()
            r1.zzd = r0
            return
    }

    static /* synthetic */ com.google.android.gms.internal.auth.zzhs zzo() {
            com.google.android.gms.internal.auth.zzhs r0 = com.google.android.gms.internal.auth.zzhs.zzb
            return r0
    }

    public static com.google.android.gms.internal.auth.zzhs zzp(byte[] r1) throws com.google.android.gms.internal.auth.zzfb {
            com.google.android.gms.internal.auth.zzhs r0 = com.google.android.gms.internal.auth.zzhs.zzb
            com.google.android.gms.internal.auth.zzev r1 = com.google.android.gms.internal.auth.zzev.zzd(r0, r1)
            com.google.android.gms.internal.auth.zzhs r1 = (com.google.android.gms.internal.auth.zzhs) r1
            return r1
    }

    @Override // com.google.android.gms.internal.auth.zzev
    protected final java.lang.Object zzn(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            int r1 = r1 + (-1)
            r2 = 1
            if (r1 == 0) goto L32
            r3 = 2
            if (r1 == r3) goto L22
            r2 = 3
            if (r1 == r2) goto L1c
            r2 = 4
            r3 = 0
            if (r1 == r2) goto L16
            r2 = 5
            if (r1 == r2) goto L13
            return r3
        L13:
            com.google.android.gms.internal.auth.zzhs r1 = com.google.android.gms.internal.auth.zzhs.zzb
            return r1
        L16:
            com.google.android.gms.internal.auth.zzhr r1 = new com.google.android.gms.internal.auth.zzhr
            r1.<init>(r3)
            return r1
        L1c:
            com.google.android.gms.internal.auth.zzhs r1 = new com.google.android.gms.internal.auth.zzhs
            r1.<init>()
            return r1
        L22:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            java.lang.String r3 = "zzd"
            r1[r2] = r3
            com.google.android.gms.internal.auth.zzhs r2 = com.google.android.gms.internal.auth.zzhs.zzb
            java.lang.String r3 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzev.zzh(r2, r3, r1)
            return r1
        L32:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            return r1
    }

    public final java.util.List zzq() {
            r1 = this;
            com.google.android.gms.internal.auth.zzez r0 = r1.zzd
            return r0
    }
}
