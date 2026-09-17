package com.google.android.ump;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public class FormError {
    private final int zza;
    private final java.lang.String zzb;

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int r1, @androidx.annotation.RecentlyNonNull java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public int getErrorCode() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
