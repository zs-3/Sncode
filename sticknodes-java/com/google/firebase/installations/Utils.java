package com.google.firebase.installations;

/* loaded from: classes2.dex */
public final class Utils {
    private static final java.util.regex.Pattern API_KEY_FORMAT = null;
    public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = 0;
    private static com.google.firebase.installations.Utils singleton;
    private final com.google.firebase.installations.time.Clock clock;

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            r1 = 1
            long r0 = r0.toSeconds(r1)
            com.google.firebase.installations.Utils.AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = r0
            java.lang.String r0 = "\\AA[\\w-]{38}\\z"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.firebase.installations.Utils.API_KEY_FORMAT = r0
            return
    }

    private Utils(com.google.firebase.installations.time.Clock r1) {
            r0 = this;
            r0.<init>()
            r0.clock = r1
            return
    }

    public static com.google.firebase.installations.Utils getInstance() {
            com.google.firebase.installations.time.SystemClock r0 = com.google.firebase.installations.time.SystemClock.getInstance()
            com.google.firebase.installations.Utils r0 = getInstance(r0)
            return r0
    }

    public static com.google.firebase.installations.Utils getInstance(com.google.firebase.installations.time.Clock r1) {
            com.google.firebase.installations.Utils r0 = com.google.firebase.installations.Utils.singleton
            if (r0 != 0) goto Lb
            com.google.firebase.installations.Utils r0 = new com.google.firebase.installations.Utils
            r0.<init>(r1)
            com.google.firebase.installations.Utils.singleton = r0
        Lb:
            com.google.firebase.installations.Utils r1 = com.google.firebase.installations.Utils.singleton
            return r1
    }

    static boolean isValidApiKeyFormat(java.lang.String r1) {
            java.util.regex.Pattern r0 = com.google.firebase.installations.Utils.API_KEY_FORMAT
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
    }

    static boolean isValidAppIdFormat(java.lang.String r1) {
            java.lang.String r0 = ":"
            boolean r1 = r1.contains(r0)
            return r1
    }

    public long currentTimeInMillis() {
            r2 = this;
            com.google.firebase.installations.time.Clock r0 = r2.clock
            long r0 = r0.currentTimeMillis()
            return r0
    }

    public long currentTimeInSecs() {
            r3 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r3.currentTimeInMillis()
            long r0 = r0.toSeconds(r1)
            return r0
    }

    public long getRandomDelayForSyncPrevention() {
            r4 = this;
            double r0 = java.lang.Math.random()
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r2
            long r0 = (long) r0
            return r0
    }

    public boolean isAuthTokenExpired(com.google.firebase.installations.local.PersistedInstallationEntry r9) {
            r8 = this;
            java.lang.String r0 = r9.getAuthToken()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            long r2 = r9.getTokenCreationEpochInSecs()
            long r4 = r9.getExpiresInSecs()
            long r2 = r2 + r4
            long r4 = r8.currentTimeInSecs()
            long r6 = com.google.firebase.installations.Utils.AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS
            long r4 = r4 + r6
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L21
            return r1
        L21:
            r9 = 0
            return r9
    }
}
