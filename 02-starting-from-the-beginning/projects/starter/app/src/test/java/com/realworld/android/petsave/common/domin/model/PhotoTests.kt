package com.realworld.android.petsave.common.domin.model

import com.realworld.android.petsave.common.domain.model.animal.Media
import org.junit.Assert.assertEquals
import org.junit.Test

class PhotoTests {
    private val mediumPhoto = "mediumPhoto"
    private val fullPhoto = "fullPhoto"
    private val invalidPhoto = ""

    @Test
    fun photo_getSmallestAvailablePhoto_hasMediumPhoto(){
        //Given
        val photo = Media.Photo(mediumPhoto,fullPhoto)
        val expectedValue = mediumPhoto
        //When
        val smallestPhoto = photo.getSmallestAvailablePhoto()
        //Then
        assertEquals(smallestPhoto,expectedValue)
    }

    @Test
    fun photo_getSmallestAvailablePhoto_hasFullPhoto(){
        val photo = Media.Photo(invalidPhoto,fullPhoto)
        val expectedPhoto = fullPhoto
        val smallestPhoto = photo.getSmallestAvailablePhoto()
        assertEquals(smallestPhoto,expectedPhoto)
    }

    @Test
    fun photo_getSmallestPhoto_invalidPhoto(){
        val photo = Media.Photo(invalidPhoto,invalidPhoto)
        val expectedPhoto = invalidPhoto
        val smallestPhoto = photo.getSmallestAvailablePhoto()
        assertEquals(smallestPhoto,expectedPhoto)
    }
}