package com.eden.orchid.api.render;

import com.eden.orchid.api.OrchidService;
import com.eden.orchid.api.theme.assets.AssetPage;
import com.eden.orchid.api.theme.pages.OrchidPage;
import com.google.inject.ImplementedBy;

import java.io.InputStream;

/**
 * @since v1.0.0
 * @orchidApi services
 */
@ImplementedBy(RenderServiceImpl.class)
public interface RenderService extends OrchidService {

    enum RenderMode {
        TEMPLATE, RAW, BINARY
    }

    /**
     * Whether to exclude drafts, which is the default behavior, or whether to include them. 
     *
     * @since v1.0.0
     */
    default boolean includeDrafts() {
        return getService(RenderService.class).includeDrafts();
    }

    /**
     * Render the given page with the default template determined by the page, returning an InputStream representing the
     * final contents.
     *
     * @param page the page to render
     * @return InputStream the stream representing the final contents
     * @since v1.0.0
     */
    @kotlin.Deprecated(message = "Set the RenderMode in the page's constructor and use getRendered instead.")
    default InputStream getRenderedTemplate(OrchidPage page) {
        return getService(RenderService.class).getRenderedTemplate(page);
    }

    /**
     * Render the given page with the default template determined by the page, producing a side-effect as the intended
     * final output. 
     *
     * @param page the page to render
     * @return if the page was not skipped, the result of {@link OrchidRenderer} indicating whether the page was successfully rendered, false otherwise
     * @since v1.0.0
     */
    @kotlin.Deprecated(message = "Set the RenderMode in the page's constructor and use render instead.")
    default boolean renderTemplate(final OrchidPage page) {
        return getService(RenderService.class).renderTemplate(page);
    }
    
    /**
     * Render the content of a page directly, without any template, returning an InputStream representing the
     * final contents. The contents may still be preprocessed, and is useful for rendering text assets like CSS or JS.
     *
     * @param page the page to render
     * @return InputStream the stream representing the final contents
     * @since v1.0.0
     */
    @kotlin.Deprecated(message = "Set the RenderMode in the page's constructor and use getRendered instead.")
    default InputStream getRenderedRaw(OrchidPage page) {
        return getService(RenderService.class).getRenderedRaw(page);
    }

    /**
     * Render the content of a page directly, without any template, producing a side-effect as the intended final
     * output. The contents may still be preprocessed, and is useful for rendering text assets like CSS or JS.
     *
     * @param page the page to render
     * @return if the page was not skipped, the result of {@link OrchidRenderer} indicating whether the page was successfully rendered, false otherwise
     * @since v1.0.0
     */
    @kotlin.Deprecated(message = "Set the RenderMode in the page's constructor and use render instead.")
    default boolean renderRaw(final OrchidPage page) {
        return getService(RenderService.class).renderRaw(page);
    }

    /**
     * Render the content of a page directly, as a binary stream, returning an InputStream representing the final
     * contents. No further processing is performed on the file contents, so as to preserve the binary format.
     *
     * @param page the page to render
     * @return InputStream the stream used to create side-effects by the render operation
     * @since v1.0.0
     */
    @kotlin.Deprecated(message = "Set the RenderMode in the page's constructor and use getRendered instead.")
    default InputStream getRenderedBinary(OrchidPage page) {
        return getService(RenderService.class).getRenderedBinary(page);
    }

    /**
     * Render the content of a page directly, as a binary stream, producing a side-effect as the intended final
     * output. No further processing is performed on the file contents, so as to preserve the binary format.
     *
     * @param page the page to render
     * @return if the page was not skipped, the result of {@link OrchidRenderer} indicating whether the page was successfully rendered, false otherwise
     * @since v1.0.0
     */
    @kotlin.Deprecated(message = "Set the RenderMode in the page's constructor and use render instead.")
    default boolean renderBinary(final OrchidPage page) {
        return getService(RenderService.class).renderBinary(page);
    }

    /**
     * Dynamically use a RenderMode enum to determine which rendering operation to perform.
     *
     * @param page       the page to render
     * @return if the page was not skipped, the result of {@link OrchidRenderer} indicating whether the page was successfully rendered, false otherwise
     * @since v1.0.0
     */
    default boolean render(final OrchidPage page) {
        return getService(RenderService.class).render(page);
    }

    /**
     * Dynamically use a RenderMode enum to determine which rendering operation to perform.
     *
     * @param page       the page to render
     * @return InputStream the stream used to create side-effects by the render operation
     * @since v1.0.0
     */
    default InputStream getRendered(OrchidPage page) {
        return getService(RenderService.class).getRendered(page);
    }

    /**
     * Renders an AssetPage. If the page represents a binary asset, it will be rendered with {@link #renderBinary(OrchidPage)},
     * otherwise it will be rendered with {@link #renderRaw(OrchidPage)}
     *
     * @param asset the asset to render
     * @return if the page was not skipped, the result of {@link OrchidRenderer} indicating whether the page was successfully rendered, false otherwise
     * @since v1.0.0
     */
    default boolean renderAsset(final AssetPage asset) {
        return getService(RenderService.class).renderAsset(asset);
    }

}
