package com.googlecode.mp4parser.authoring.tracks.ttml;

/* loaded from: classes2.dex */
public class TtmlHelpers {
    public static final javax.xml.namespace.NamespaceContext NAMESPACE_CONTEXT = null;
    public static final java.lang.String SMPTE_TT_NAMESPACE = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt";
    public static final java.lang.String TTML_NAMESPACE = "http://www.w3.org/ns/ttml";
    static byte[] namespacesStyleSheet1;

    /* renamed from: com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class TextTrackNamespaceContext implements javax.xml.namespace.NamespaceContext {
        private TextTrackNamespaceContext() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ TextTrackNamespaceContext(com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.TextTrackNamespaceContext r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.xml.namespace.NamespaceContext
        public java.lang.String getNamespaceURI(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "ttml"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto Lb
                java.lang.String r2 = "http://www.w3.org/ns/ttml"
                return r2
            Lb:
                java.lang.String r0 = "smpte"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L16
                java.lang.String r2 = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt"
                return r2
            L16:
                r2 = 0
                return r2
        }

        @Override // javax.xml.namespace.NamespaceContext
        public java.lang.String getPrefix(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "http://www.w3.org/ns/ttml"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto Lb
                java.lang.String r2 = "ttml"
                return r2
            Lb:
                java.lang.String r0 = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L16
                java.lang.String r2 = "smpte"
                return r2
            L16:
                r2 = 0
                return r2
        }

        @Override // javax.xml.namespace.NamespaceContext
        public java.util.Iterator getPrefixes(java.lang.String r2) {
                r1 = this;
                java.lang.String r2 = "ttml"
                java.lang.String r0 = "smpte"
                java.lang.String[] r2 = new java.lang.String[]{r2, r0}
                java.util.List r2 = java.util.Arrays.asList(r2)
                java.util.Iterator r2 = r2.iterator()
                return r2
        }
    }

    static {
            java.lang.String r0 = "<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n    <xsl:output method=\"text\"/>\n    <xsl:key name=\"kElemByNSURI\"\n             match=\"*[namespace::*[not(. = ../../namespace::*)]]\"\n              use=\"namespace::*[not(. = ../../namespace::*)]\"/>\n    <xsl:template match=\"/\">\n        <xsl:for-each select=\n            \"//namespace::*[not(. = ../../namespace::*)]\n                           [count(..|key('kElemByNSURI',.)[1])=1]\">\n            <xsl:value-of select=\"concat(.,'&#xA;')\"/>\n        </xsl:for-each>\n    </xsl:template>\n</xsl:stylesheet>"
            byte[] r0 = r0.getBytes()
            com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.namespacesStyleSheet1 = r0
            com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers$TextTrackNamespaceContext r0 = new com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers$TextTrackNamespaceContext
            r1 = 0
            r0.<init>(r1)
            com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.NAMESPACE_CONTEXT = r0
            return
    }

    public TtmlHelpers() {
            r0 = this;
            r0.<init>()
            return
    }

    private static long copyLarge(java.io.InputStream r6, java.io.File r7) throws java.io.IOException {
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]
            java.io.File r1 = r7.getParentFile()
            r1.mkdirs()
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r7)
            r2 = 0
        L12:
            r7 = -1
            int r4 = r6.read(r0)     // Catch: java.lang.Throwable -> L24
            if (r7 != r4) goto L1d
            r1.close()
            return r2
        L1d:
            r7 = 0
            r1.write(r0, r7, r4)     // Catch: java.lang.Throwable -> L24
            long r4 = (long) r4
            long r2 = r2 + r4
            goto L12
        L24:
            r6 = move-exception
            r1.close()
            throw r6
    }

    public static void deepCopyDocument(org.w3c.dom.Document r6, java.io.File r7) throws java.io.IOException {
            javax.xml.xpath.XPathFactory r0 = javax.xml.xpath.XPathFactory.newInstance()     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            javax.xml.xpath.XPath r0 = r0.newXPath()     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.lang.String r1 = "//*/@backgroundImage"
            javax.xml.xpath.XPathExpression r0 = r0.compile(r1)     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            javax.xml.namespace.QName r1 = javax.xml.xpath.XPathConstants.NODESET     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.lang.Object r0 = r0.evaluate(r6, r1)     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            org.w3c.dom.NodeList r0 = (org.w3c.dom.NodeList) r0     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            r1 = 0
        L17:
            int r2 = r0.getLength()     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            if (r1 < r2) goto L32
            java.net.URI r0 = new java.net.URI     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.lang.String r6 = r6.getDocumentURI()     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            r0.<init>(r6)     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.net.URL r6 = r0.toURL()     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.io.InputStream r6 = r6.openStream()     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            copyLarge(r6, r7)     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            return
        L32:
            org.w3c.dom.Node r2 = r0.item(r1)     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.lang.String r2 = r2.getNodeValue()     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.net.URI r2 = java.net.URI.create(r2)     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            boolean r3 = r2.isAbsolute()     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            if (r3 != 0) goto L71
            java.net.URI r3 = new java.net.URI     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.lang.String r4 = r6.getDocumentURI()     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            r3.<init>(r4)     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.net.URI r3 = r3.resolve(r2)     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.net.URL r3 = r3.toURL()     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.io.InputStream r3 = r3.openStream()     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.io.File r4 = new java.io.File     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.net.URI r5 = r7.toURI()     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.net.URI r2 = r5.resolve(r2)     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.net.URL r2 = r2.toURL()     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            java.lang.String r2 = r2.getFile()     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            r4.<init>(r2)     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
            copyLarge(r3, r4)     // Catch: java.net.URISyntaxException -> L74 javax.xml.xpath.XPathExpressionException -> L7b
        L71:
            int r1 = r1 + 1
            goto L17
        L74:
            r6 = move-exception
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r6)
            throw r7
        L7b:
            r6 = move-exception
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r6)
            throw r7
    }

    public static java.lang.String[] getAllNamespaces(org.w3c.dom.Document r4) {
            javax.xml.transform.TransformerFactory r0 = javax.xml.transform.TransformerFactory.newInstance()
            javax.xml.transform.stream.StreamSource r1 = new javax.xml.transform.stream.StreamSource     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            byte[] r3 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.namespacesStyleSheet1     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            r2.<init>(r3)     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            r1.<init>(r2)     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            javax.xml.transform.Transformer r0 = r0.newTransformer(r1)     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            r1.<init>()     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            javax.xml.transform.dom.DOMSource r2 = new javax.xml.transform.dom.DOMSource     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            r2.<init>(r4)     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            javax.xml.transform.stream.StreamResult r4 = new javax.xml.transform.stream.StreamResult     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            r4.<init>(r1)     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            r0.transform(r2, r4)     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            java.lang.StringBuffer r1 = r1.getBuffer()     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            java.lang.String r1 = r1.toString()     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            java.lang.String r2 = "\n"
            java.lang.String[] r1 = r1.split(r2)     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            r0.<init>(r1)     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            r4.<init>(r0)     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            int r0 = r4.size()     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: javax.xml.transform.TransformerException -> L4f javax.xml.transform.TransformerConfigurationException -> L56
            return r4
        L4f:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
        L56:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
    }

    public static long getEndTime(org.w3c.dom.Node r5) {
            r0 = 0
            r2 = r5
        L3:
            org.w3c.dom.Node r2 = r2.getParentNode()
            if (r2 != 0) goto L2d
            org.w3c.dom.NamedNodeMap r2 = r5.getAttributes()
            if (r2 == 0) goto L2c
            org.w3c.dom.NamedNodeMap r2 = r5.getAttributes()
            java.lang.String r3 = "end"
            org.w3c.dom.Node r2 = r2.getNamedItem(r3)
            if (r2 == 0) goto L2c
            org.w3c.dom.NamedNodeMap r5 = r5.getAttributes()
            org.w3c.dom.Node r5 = r5.getNamedItem(r3)
            java.lang.String r5 = r5.getNodeValue()
            long r2 = toTime(r5)
            long r0 = r0 + r2
        L2c:
            return r0
        L2d:
            org.w3c.dom.NamedNodeMap r3 = r2.getAttributes()
            if (r3 == 0) goto L3
            org.w3c.dom.NamedNodeMap r3 = r2.getAttributes()
            java.lang.String r4 = "begin"
            org.w3c.dom.Node r3 = r3.getNamedItem(r4)
            if (r3 == 0) goto L3
            org.w3c.dom.NamedNodeMap r3 = r2.getAttributes()
            org.w3c.dom.Node r3 = r3.getNamedItem(r4)
            java.lang.String r3 = r3.getNodeValue()
            long r3 = toTime(r3)
            long r0 = r0 + r3
            goto L3
    }

    public static long getStartTime(org.w3c.dom.Node r5) {
            r0 = 0
            r2 = r5
        L3:
            org.w3c.dom.Node r2 = r2.getParentNode()
            java.lang.String r3 = "begin"
            if (r2 != 0) goto L2d
            org.w3c.dom.NamedNodeMap r2 = r5.getAttributes()
            if (r2 == 0) goto L2c
            org.w3c.dom.NamedNodeMap r2 = r5.getAttributes()
            org.w3c.dom.Node r2 = r2.getNamedItem(r3)
            if (r2 == 0) goto L2c
            org.w3c.dom.NamedNodeMap r5 = r5.getAttributes()
            org.w3c.dom.Node r5 = r5.getNamedItem(r3)
            java.lang.String r5 = r5.getNodeValue()
            long r2 = toTime(r5)
            long r0 = r0 + r2
        L2c:
            return r0
        L2d:
            org.w3c.dom.NamedNodeMap r4 = r2.getAttributes()
            if (r4 == 0) goto L3
            org.w3c.dom.NamedNodeMap r4 = r2.getAttributes()
            org.w3c.dom.Node r4 = r4.getNamedItem(r3)
            if (r4 == 0) goto L3
            org.w3c.dom.NamedNodeMap r4 = r2.getAttributes()
            org.w3c.dom.Node r3 = r4.getNamedItem(r3)
            java.lang.String r3 = r3.getNodeValue()
            long r3 = toTime(r3)
            long r0 = r0 + r3
            goto L3
    }

    public static void main(java.lang.String[] r2) throws java.net.URISyntaxException, javax.xml.parsers.ParserConfigurationException, java.io.IOException, org.xml.sax.SAXException, javax.xml.xpath.XPathExpressionException, javax.xml.transform.TransformerException {
            javax.xml.parsers.DocumentBuilderFactory r2 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            r0 = 1
            r2.setNamespaceAware(r0)
            javax.xml.parsers.DocumentBuilder r2 = r2.newDocumentBuilder()
            java.lang.String r0 = "C:\\dev\\mp4parser\\a.xml"
            org.w3c.dom.Document r2 = r2.parse(r0)
            r0 = 60
            java.util.List r2 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlSegmenter.split(r2, r0)
            com.googlecode.mp4parser.authoring.tracks.ttml.TtmlTrackImpl r0 = new com.googlecode.mp4parser.authoring.tracks.ttml.TtmlTrackImpl
            java.lang.String r1 = "a.xml"
            r0.<init>(r1, r2)
            com.googlecode.mp4parser.authoring.Movie r2 = new com.googlecode.mp4parser.authoring.Movie
            r2.<init>()
            r2.addTrack(r0)
            com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder r0 = new com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder
            r0.<init>()
            com.coremedia.iso.boxes.Container r2 = r0.build(r2)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.lang.String r1 = "output.mp4"
            r0.<init>(r1)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            r2.writeContainer(r0)
            return
    }

    public static void pretty(org.w3c.dom.Document r3, java.io.OutputStream r4, int r5) throws java.io.IOException {
            javax.xml.transform.TransformerFactory r0 = javax.xml.transform.TransformerFactory.newInstance()
            javax.xml.transform.Transformer r0 = r0.newTransformer()     // Catch: javax.xml.transform.TransformerConfigurationException -> L36
            java.lang.String r1 = "encoding"
            java.lang.String r2 = "UTF-8"
            r0.setOutputProperty(r1, r2)
            if (r5 <= 0) goto L21
            java.lang.String r1 = "indent"
            java.lang.String r2 = "yes"
            r0.setOutputProperty(r1, r2)
            java.lang.String r5 = java.lang.Integer.toString(r5)
            java.lang.String r1 = "{http://xml.apache.org/xslt}indent-amount"
            r0.setOutputProperty(r1, r5)
        L21:
            javax.xml.transform.stream.StreamResult r5 = new javax.xml.transform.stream.StreamResult
            r5.<init>(r4)
            javax.xml.transform.dom.DOMSource r4 = new javax.xml.transform.dom.DOMSource
            r4.<init>(r3)
            r0.transform(r4, r5)     // Catch: javax.xml.transform.TransformerException -> L2f
            return
        L2f:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException
            r4.<init>(r3)
            throw r4
        L36:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    public static long toTime(java.lang.String r13) {
            java.lang.String r0 = "(-?)([0-9][0-9]):([0-9][0-9]):([0-9][0-9])([\\.:][0-9][0-9]?[0-9]?)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto La0
            r13 = 1
            java.lang.String r1 = r0.group(r13)
            r2 = 2
            java.lang.String r2 = r0.group(r2)
            r3 = 3
            java.lang.String r3 = r0.group(r3)
            r4 = 4
            java.lang.String r4 = r0.group(r4)
            r5 = 5
            java.lang.String r0 = r0.group(r5)
            if (r0 != 0) goto L2d
            java.lang.String r0 = ".000"
        L2d:
            java.lang.String r5 = ":"
            java.lang.String r6 = "."
            java.lang.String r0 = r0.replace(r5, r6)
            long r7 = java.lang.Long.parseLong(r2)
            r9 = 60
            long r7 = r7 * r9
            long r7 = r7 * r9
            r11 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r11
            long r2 = java.lang.Long.parseLong(r3)
            long r2 = r2 * r9
            long r2 = r2 * r11
            long r7 = r7 + r2
            long r2 = java.lang.Long.parseLong(r4)
            long r2 = r2 * r11
            long r7 = r7 + r2
            boolean r2 = r0.contains(r5)
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.String r9 = "0"
            if (r2 == 0) goto L7e
            double r7 = (double) r7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r9)
            java.lang.String r0 = r0.replace(r5, r6)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            double r5 = java.lang.Double.parseDouble(r0)
            r9 = 4630826316843712512(0x4044000000000000, double:40.0)
            double r5 = r5 * r9
            double r5 = r5 * r3
            double r7 = r7 + r5
            long r2 = (long) r7
            goto L93
        L7e:
            double r5 = (double) r7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r9)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            double r7 = java.lang.Double.parseDouble(r0)
            double r7 = r7 * r3
            double r5 = r5 + r7
            long r2 = (long) r5
        L93:
            java.lang.String r0 = "-"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9c
            r13 = -1
        L9c:
            long r0 = (long) r13
            long r2 = r2 * r0
            return r2
        La0:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot match '"
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = "' to time expression"
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
    }

    public static java.lang.String toTimeExpression(long r1) {
            r0 = -1
            java.lang.String r1 = toTimeExpression(r1, r0)
            return r1
    }

    public static java.lang.String toTimeExpression(long r13, int r15) {
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            java.lang.String r0 = ""
            goto Lb
        L9:
            java.lang.String r0 = "-"
        Lb:
            long r13 = java.lang.Math.abs(r13)
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r13 / r1
            r5 = 60
            long r3 = r3 / r5
            long r3 = r3 / r5
            long r7 = r3 * r1
            long r7 = r7 * r5
            long r7 = r7 * r5
            long r13 = r13 - r7
            long r7 = r13 / r1
            long r7 = r7 / r5
            long r9 = r7 * r1
            long r9 = r9 * r5
            long r13 = r13 - r9
            long r5 = r13 / r1
            long r1 = r1 * r5
            long r13 = r13 - r1
            r1 = 4
            r2 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            r12 = 5
            if (r15 < 0) goto L56
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r0
            java.lang.Long r14 = java.lang.Long.valueOf(r3)
            r13[r10] = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r7)
            r13[r9] = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r5)
            r13[r2] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            r13[r1] = r14
            java.lang.String r14 = "%s%02d:%02d:%02d:%d"
            java.lang.String r13 = java.lang.String.format(r14, r13)
            return r13
        L56:
            java.lang.Object[] r15 = new java.lang.Object[r12]
            r15[r11] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r15[r10] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r15[r9] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r15[r2] = r0
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r15[r1] = r13
            java.lang.String r13 = "%s%02d:%02d:%02d.%03d"
            java.lang.String r13 = java.lang.String.format(r13, r15)
            return r13
    }
}
