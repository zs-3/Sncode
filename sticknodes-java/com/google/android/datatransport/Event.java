package com.google.android.datatransport;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class Event<T> {
    public Event() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(int r7, T r8) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.DEFAULT
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(int r7, T r8, com.google.android.datatransport.EventContext r9) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.DEFAULT
            r4 = 0
            r0 = r6
            r2 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(int r7, T r8, com.google.android.datatransport.ProductData r9) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.DEFAULT
            r5 = 0
            r0 = r6
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(int r7, T r8, com.google.android.datatransport.ProductData r9, com.google.android.datatransport.EventContext r10) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.DEFAULT
            r0 = r6
            r2 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(T r7) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.DEFAULT
            r1 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(T r7, com.google.android.datatransport.EventContext r8) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.DEFAULT
            r1 = 0
            r4 = 0
            r0 = r6
            r2 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(T r7, com.google.android.datatransport.ProductData r8) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.DEFAULT
            r1 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(T r7, com.google.android.datatransport.ProductData r8, com.google.android.datatransport.EventContext r9) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.DEFAULT
            r1 = 0
            r0 = r6
            r2 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(int r7, T r8) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.VERY_LOW
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(int r7, T r8, com.google.android.datatransport.EventContext r9) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.VERY_LOW
            r4 = 0
            r0 = r6
            r2 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(int r7, T r8, com.google.android.datatransport.ProductData r9) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.VERY_LOW
            r5 = 0
            r0 = r6
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(int r7, T r8, com.google.android.datatransport.ProductData r9, com.google.android.datatransport.EventContext r10) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.VERY_LOW
            r0 = r6
            r2 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(T r7) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.VERY_LOW
            r1 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(T r7, com.google.android.datatransport.EventContext r8) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.VERY_LOW
            r1 = 0
            r4 = 0
            r0 = r6
            r2 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(T r7, com.google.android.datatransport.ProductData r8) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.VERY_LOW
            r1 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(T r7, com.google.android.datatransport.ProductData r8, com.google.android.datatransport.EventContext r9) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.VERY_LOW
            r1 = 0
            r0 = r6
            r2 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(int r7, T r8) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.HIGHEST
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(int r7, T r8, com.google.android.datatransport.EventContext r9) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.HIGHEST
            r4 = 0
            r0 = r6
            r2 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(int r7, T r8, com.google.android.datatransport.ProductData r9) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.HIGHEST
            r5 = 0
            r0 = r6
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(int r7, T r8, com.google.android.datatransport.ProductData r9, com.google.android.datatransport.EventContext r10) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.HIGHEST
            r0 = r6
            r2 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(T r7) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.HIGHEST
            r1 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(T r7, com.google.android.datatransport.EventContext r8) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.HIGHEST
            r1 = 0
            r4 = 0
            r0 = r6
            r2 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(T r7, com.google.android.datatransport.ProductData r8) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.HIGHEST
            r1 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(T r7, com.google.android.datatransport.ProductData r8, com.google.android.datatransport.EventContext r9) {
            com.google.android.datatransport.AutoValue_Event r6 = new com.google.android.datatransport.AutoValue_Event
            com.google.android.datatransport.Priority r3 = com.google.android.datatransport.Priority.HIGHEST
            r1 = 0
            r0 = r6
            r2 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public abstract java.lang.Integer getCode();

    public abstract com.google.android.datatransport.EventContext getEventContext();

    public abstract T getPayload();

    public abstract com.google.android.datatransport.Priority getPriority();

    public abstract com.google.android.datatransport.ProductData getProductData();
}
