package com.google.android.datatransport.runtime.backends;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class CreationContext {
    private static final java.lang.String DEFAULT_BACKEND_NAME = "cct";

    public CreationContext() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.backends.CreationContext create(android.content.Context r2, com.google.android.datatransport.runtime.time.Clock r3, com.google.android.datatransport.runtime.time.Clock r4) {
            com.google.android.datatransport.runtime.backends.AutoValue_CreationContext r0 = new com.google.android.datatransport.runtime.backends.AutoValue_CreationContext
            java.lang.String r1 = "cct"
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public static com.google.android.datatransport.runtime.backends.CreationContext create(android.content.Context r1, com.google.android.datatransport.runtime.time.Clock r2, com.google.android.datatransport.runtime.time.Clock r3, java.lang.String r4) {
            com.google.android.datatransport.runtime.backends.AutoValue_CreationContext r0 = new com.google.android.datatransport.runtime.backends.AutoValue_CreationContext
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public abstract android.content.Context getApplicationContext();

    public abstract java.lang.String getBackendName();

    public abstract com.google.android.datatransport.runtime.time.Clock getMonotonicClock();

    public abstract com.google.android.datatransport.runtime.time.Clock getWallClock();
}
