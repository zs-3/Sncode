package com.google.android.datatransport.runtime.backends;

/* loaded from: classes.dex */
final class AutoValue_CreationContext extends com.google.android.datatransport.runtime.backends.CreationContext {
    private final android.content.Context applicationContext;
    private final java.lang.String backendName;
    private final com.google.android.datatransport.runtime.time.Clock monotonicClock;
    private final com.google.android.datatransport.runtime.time.Clock wallClock;

    AutoValue_CreationContext(android.content.Context r2, com.google.android.datatransport.runtime.time.Clock r3, com.google.android.datatransport.runtime.time.Clock r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null applicationContext"
            java.util.Objects.requireNonNull(r2, r0)
            r1.applicationContext = r2
            java.lang.String r2 = "Null wallClock"
            java.util.Objects.requireNonNull(r3, r2)
            r1.wallClock = r3
            java.lang.String r2 = "Null monotonicClock"
            java.util.Objects.requireNonNull(r4, r2)
            r1.monotonicClock = r4
            java.lang.String r2 = "Null backendName"
            java.util.Objects.requireNonNull(r5, r2)
            r1.backendName = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.datatransport.runtime.backends.CreationContext
            r2 = 0
            if (r1 == 0) goto L3e
            com.google.android.datatransport.runtime.backends.CreationContext r5 = (com.google.android.datatransport.runtime.backends.CreationContext) r5
            android.content.Context r1 = r4.applicationContext
            android.content.Context r3 = r5.getApplicationContext()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            com.google.android.datatransport.runtime.time.Clock r1 = r4.wallClock
            com.google.android.datatransport.runtime.time.Clock r3 = r5.getWallClock()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            com.google.android.datatransport.runtime.time.Clock r1 = r4.monotonicClock
            com.google.android.datatransport.runtime.time.Clock r3 = r5.getMonotonicClock()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            java.lang.String r1 = r4.backendName
            java.lang.String r5 = r5.getBackendName()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L3c
            goto L3d
        L3c:
            r0 = 0
        L3d:
            return r0
        L3e:
            return r2
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public android.content.Context getApplicationContext() {
            r1 = this;
            android.content.Context r0 = r1.applicationContext
            return r0
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public java.lang.String getBackendName() {
            r1 = this;
            java.lang.String r0 = r1.backendName
            return r0
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public com.google.android.datatransport.runtime.time.Clock getMonotonicClock() {
            r1 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = r1.monotonicClock
            return r0
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public com.google.android.datatransport.runtime.time.Clock getWallClock() {
            r1 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = r1.wallClock
            return r0
    }

    public int hashCode() {
            r3 = this;
            android.content.Context r0 = r3.applicationContext
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            com.google.android.datatransport.runtime.time.Clock r2 = r3.wallClock
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.android.datatransport.runtime.time.Clock r2 = r3.monotonicClock
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r1 = r3.backendName
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CreationContext{applicationContext="
            r0.append(r1)
            android.content.Context r1 = r2.applicationContext
            r0.append(r1)
            java.lang.String r1 = ", wallClock="
            r0.append(r1)
            com.google.android.datatransport.runtime.time.Clock r1 = r2.wallClock
            r0.append(r1)
            java.lang.String r1 = ", monotonicClock="
            r0.append(r1)
            com.google.android.datatransport.runtime.time.Clock r1 = r2.monotonicClock
            r0.append(r1)
            java.lang.String r1 = ", backendName="
            r0.append(r1)
            java.lang.String r1 = r2.backendName
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
