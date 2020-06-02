package gildedRose

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object GuildedRoseTest: Spek({
    describe("GildedRose") {
        context("update quality") {
            val items = arrayOf<Item>(Item("foo", 0, 0))
            val app = GildedRose(items)
            app.updateQuality()
            it("should equal") {
                assertThat("foo", equalTo(app.items[0].name))
            }
        }
    }
})